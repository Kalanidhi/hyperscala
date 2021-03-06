package org.hyperscala.web.module

import org.hyperscala.web.site.{Website, Webpage}
import org.powerscala.Version
import org.hyperscala.html.tag
import org.hyperscala.module._

/**
 * @author Matt Hicks <matt@outr.com>
 */
object StyleChange extends Module {
  def name = "stylechange"

  def version = Version(1)

  def init() = {
    Website().register("/js/stylechange.js", "stylechange.js")
  }

  def load() = {
    Webpage().head.contents += new tag.Script(mimeType = "text/javascript", src = "/js/stylechange.js")
  }
}
