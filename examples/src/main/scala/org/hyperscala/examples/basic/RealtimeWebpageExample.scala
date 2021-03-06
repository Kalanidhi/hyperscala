package org.hyperscala.examples.basic

import org.hyperscala.html._
import org.powerscala.Color
import org.hyperscala.event.JavaScriptEvent
import org.hyperscala.web.site.Webpage
import org.hyperscala.realtime.Realtime
import org.hyperscala.examples.Example
import language.reflectiveCalls

/**
 * @author Matt Hicks <matt@outr.com>
 */
class RealtimeWebpageExample extends Example {
  Webpage().require(Realtime)

  var count = 0
  var reversed = false

  val input = new tag.Input {
    changeEvent := JavaScriptEvent()

    value.change.on {
      case evt => println("Input value changed: %s".format(value()))
    }
  }
  contents += input

  val select = new tag.Select(id = "realtimeSelect") {
    changeEvent := JavaScriptEvent()

    contents += new tag.Option(id = "first", value = "uno", content = "One")
    contents += new tag.Option(id = "second", value = "dos", content = "Two")
    contents += new tag.Option(id = "third", value = "tres", content = "Three")

    changeEvent.on {
      case evt => println("Selected: %s".format(selected()))
    }
  }
  select.value := "dos"
  contents += select

  val textArea = new tag.TextArea {
    changeEvent := JavaScriptEvent()

    changeEvent.on {
      case evt => println(content())
    }
  }
  contents += textArea

  contents += new tag.Button(content = "Test Button") {
    clickEvent := JavaScriptEvent()

    clickEvent.on {
      case evt => {
        val selected = select.value()
        val newSelection = if (selected == "uno") {
          "dos"
        } else {
          "uno"
        }
        println(s"Selected: $selected, switching to $newSelection")
        select.value := newSelection
        input.value := "Button clicked %s".format(count)
        contents.replaceWith("Test Button %s".format(count))
        style.color = Color.random
        if (count >= 10) {
          reversed = true
        } else if (count <= 0) {
          reversed = false
        }
        if (reversed) {
          count -= 1
          RealtimeWebpageExample.this.contents -= RealtimeWebpageExample.this.contents.last
        } else {
          count += 1
          RealtimeWebpageExample.this.contents += new tag.Div {
            contents += "Testing %s!".format(count)
          }
        }
      }
    }
  }
}
