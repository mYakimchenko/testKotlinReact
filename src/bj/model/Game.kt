package bj.model

class Game {
    val playerHand: Hand = Hand("Player", 12, listOf(Card("Not implemented")))
    val dealerHand: Hand = Hand("Dealer", 20, listOf(Card("Not implemented")))

    fun deal(): Nothing = TODO("Need to implement logic")
    fun stay(): Nothing = TODO("Need to implement logic")
    fun hit(): Nothing = TODO("Need to implement logic")
}