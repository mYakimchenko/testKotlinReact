package index

import kotlinx.html.title
import react.dom.*
import kotlin.browser.document

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")

    render(rootDiv) {
        div {
            h1 { +"Blackjack" }
            div {
                attrs {
                    title = "Foo"
                    jsStyle {
                        display = "Flex"
                    }
                }

                div {
                    div { b { +"Player Hand" } }
                    div { +"cards goes here" }
                    div { b { +"12 Points" } }
                }

                div {
                    div { b { +"Dealer Hand" } }
                    div { +"cards goes here" }
                    div { b { +"14 Points" } }
                }
            }
        }
    }
}
