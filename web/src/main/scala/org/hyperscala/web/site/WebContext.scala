package org.hyperscala.web.site

import com.outr.webcommunicator.URL
import com.outr.webcommunicator.netty._
import org.hyperscala.web.cookie.Cookies
import org.hyperscala.web.session.Session
import org.hyperscala.context._
import org.hyperscala.{Unique, Page}
import org.jboss.netty.handler.codec.http.{Cookie => NettyCookie, CookieDecoder, HttpRequest}
import scala.collection.JavaConversions._
import org.hyperscala.web.cookie.Cookie
import org.jboss.netty.channel.ChannelHandlerContext
import java.net.InetSocketAddress

import language.reflectiveCalls

/**
 * @author Matt Hicks <mhicks@outr.com>
 */
object WebContext extends Context {
  val webpage = new ContextEntry[Webpage]("webpage") {
    override def onChange(page: Webpage) {
      super.onChange(value)
      Page.instance.set(page)
    }
  }
  val headers = new ContextEntry[Map[String, String]]("headers")
  val url = new ContextEntry[URL]("url")
  val cookies = new ContextEntry[Cookies]("cookies")
  val session = new ContextEntry[Session]("session")
  val localAddress = new ContextEntry[InetSocketAddress]("localAddress")
  val remoteAddress = new ContextEntry[InetSocketAddress]("remoteAddress")

  override def contextualize[T](contextual: Contextual)(f: => T): T = {
    super.contextualize(contextual) {
      webpage.get() match {
        case Some(page) => {
          Page.instance.set(page)
        }
        case None => // Nothing to do here
      }
      f
    }
  }

  def checkIn() = {
    webpage.get() match {
      case Some(page) => page.checkIn()
      case None => session().checkIn()
    }
  }

  def parse(context: ChannelHandlerContext, request: HttpRequest) = {
    // Process additional information
    val channel = context.getChannel
    localAddress := channel.getLocalAddress.asInstanceOf[InetSocketAddress]
    remoteAddress := channel.getRemoteAddress.asInstanceOf[InetSocketAddress]

    // Process headers
    headers := request.getHeaders.map(entry => entry.getKey -> entry.getValue).toMap

    // Process URL
    url := request

    // Process cookies
    val cookieHeader = request.getHeader("Cookie")
    val cookies = if (cookieHeader != null) {
      val cookieSet = new CookieDecoder().decode(cookieHeader)
      cookieSet.map(cookieConverter).toMap
    } else {
      Map.empty[String, Cookie]
    }
    this.cookies := Cookies(cookies, cookies)

    // Load or create session
    val cs = List(this.cookies().get("%sWild".format(Website().sessionCookieKey)), this.cookies().get(Website().sessionCookieKey)).flatten
    val sessionCookie = cs.headOption match {
      case Some(cookie) => cookie
      case None => {
        val cookie = Cookie(name = Website().sessionCookieKey,
                            value = Unique(),
                            maxAge = Website().sessionCookieLifetime)
        this.cookies()(cookie)   // Set a new cookie for the response
        url().domain match {    // Set a cookie for all subdomains
          case d if (Website().sessionCookieWildcard && d.indexOf('.') != -1) => {
            this.cookies()(cookie.copy(name = "%sWild".format(cookie.name), domain = ".%s".format(d)))
          }
          case _ => // Don't set a wildcard cookie
        }
        cookie
      }
    }
    session := (Website().sessions.map.get(sessionCookie.value) match {
      case Some(s) => s
      case None => Website().instantiateSession(sessionCookie.value).asInstanceOf[Session]
    })
  }

  private def cookieConverter(cookie: NettyCookie) = {
    cookie.getName -> Cookie(name = cookie.getName,
      value = cookie.getValue,
      comment = cookie.getComment,
      commentUrl = cookie.getCommentUrl,
      discard = cookie.isDiscard,
      domain = cookie.getDomain,
      httpOnly = cookie.isHttpOnly,
      maxAge = cookie.getMaxAge,
      path = cookie.getPath,
      ports = cookie.getPorts.toList.map(i => i.intValue()),
      secure = cookie.isSecure,
      version = cookie.getVersion)
  }
}
