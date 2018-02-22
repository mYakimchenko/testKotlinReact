package bj.ui

import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.button
import react.dom.div

interface ButtonEventHandler {
    fun hit()
    fun deal()
    fun stay()
}

fun RBuilder.buttonBar(buttonEventHandler: ButtonEventHandler) {
    div {
        button {
            +"Deal"
            attrs.onClickFunction = { buttonEventHandler.deal() }
        }
        button {
            +"Hit"
            attrs.onClickFunction = { buttonEventHandler.hit() }
        }
        button {
            +"Stay"
            attrs.onClickFunction = { buttonEventHandler.stay() }
        }
    }
}
