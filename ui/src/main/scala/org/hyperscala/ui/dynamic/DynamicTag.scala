package org.hyperscala.ui.dynamic

import org.hyperscala.html.HTMLTag
import org.jdom2.Element
import org.jdom2.input.SAXBuilder
import java.io.{File, StringReader}
import java.net.URL

/**
 * @author Matt Hicks <mhicks@outr.com>
 */
class DynamicTag[T <: HTMLTag] private(dynamicString: DynamicString, converter: String => String) extends DependentDynamicString(dynamicString, converter) {
  private var _element: Element = _
  def element = _element

  def create() = synchronized {
    checkUpdate()
    val tag = HTMLTag.create(element.getName).asInstanceOf[T]
    tag.read(element)
    tag
  }

  def apply(tag: HTMLTag) = synchronized {
    checkUpdate()
    tag.read(element)
  }

  override protected def refresh() {
    super.refresh()

    _element = DynamicTag.string2Element(content)
  }
}

object DynamicTag {
  import DynamicString._

  def apply[T <: HTMLTag](name: String, dynamicString: DynamicString, converter: String => String = DynamicString.defaultConverter) = {
    getOrSet(name, new DynamicTag[T](dynamicString, converter))
  }

  def static[T <: HTMLTag](name: String, content: String, converter: String => String = DynamicString.defaultConverter) = {
    apply[T](name, DynamicString.static("%s.DynamicString".format(name), content, converter))
  }

  def file[T <: HTMLTag](name: String, file: File, converter: String => String = DynamicString.defaultConverter) = {
    apply[T](name, DynamicString.file("%s.DynamicString".format(name), file, converter))
  }

  def url[T <: HTMLTag](name: String, url: URL, checkLastModified: Boolean = false, converter: String => String = DynamicString.defaultConverter) = {
    apply[T](name, DynamicString.url("%s.DynamicString".format(name), url, checkLastModified, converter))
  }

  def string2Element(html: String) = {
    val builder = new SAXBuilder()
    builder.build(new StringReader(html)).getRootElement
  }
}
