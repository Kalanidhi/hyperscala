package org.hyperscala.ui.binder

import org.hyperscala.html._
import org.hyperscala.event.JavaScriptEvent
import org.hyperscala.ui.dynamic.Binder
import language.reflectiveCalls

/**
 * @author Matt Hicks <mhicks@outr.com>
 */
class SelectBoolean(trueString: String = "Yes", falseString: String = "No") extends Binder[tag.Select, Boolean] {
  def bind(select: tag.Select) = {
    select.changeEvent := JavaScriptEvent()
    select.contents.clear()
    select.contents += new tag.Option(value = "true", content = trueString, selected = valueProperty())
    select.contents += new tag.Option(value = "false", content = falseString, selected = !valueProperty())

    select.value.change.on {
      case evt => {
        val v = select.value()
        valueProperty := v.toBoolean
      }
    }

    valueProperty.change.on {
      case evt => select.value := valueProperty().toString
    }
  }
}
