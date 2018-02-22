package bj.model

import bj.ui.ButtonEventHandler
import bj.ui.gameUI
import react.*

interface AppState : RState {
    var game: Game
}

class App : ButtonEventHandler, RComponent<RProps, AppState>() {
    override fun hit() {
        setState { game.hit() }
    }

    override fun deal() {
        setState { game.deal() }
    }

    override fun stay() {
        setState { game.stay() }
    }

    override fun AppState.init() {
        game = Game()
    }

    override fun RBuilder.render() {
        gameUI(state.game, this@App)
    }
}

fun RBuilder.app() = child(App::class) {}