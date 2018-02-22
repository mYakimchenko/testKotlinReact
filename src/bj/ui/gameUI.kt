package bj.ui

import bj.model.Game
import kotlinx.html.title
import react.RBuilder
import react.dom.div
import react.dom.h1
import react.dom.jsStyle

fun RBuilder.gameUI(game: Game, buttonEventHandler: ButtonEventHandler) {
    div {
        h1 { +"Blackjack" }
        buttonBar(buttonEventHandler)
        div {
            attrs {
                title = "Foo"
                jsStyle {
                    display = "Flex"
                }
            }

            handUI(game.playerHand)
            handUI(game.dealerHand)
        }
    }
}