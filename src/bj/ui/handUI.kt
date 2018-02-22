package bj.ui

import bj.model.Hand
import react.RBuilder
import react.dom.b
import react.dom.div
import react.dom.jsStyle

fun RBuilder.handUI(hand: Hand) {
    div {
        attrs.jsStyle {
            width = "10rem"
            height = "10rem"
            padding = "1rem"
            marginTop = "1rem"
            marginRight = "1rem"
            background = "cyan"
        }

        div { b { +"${hand.name} Hand" } }
        div {
            hand.cards.forEach {
                div { +it.name }
            }
        }
        div { b { +"${hand.points} Point" } }
    }
}