package arcade

class Card() {
    val cardID: Int
    var creditBalance: Int
    var ticketBalance: Int

    companion object {
        var UID_Generator: Int = 0
    }
    init {
        cardID = ++UID_Generator
        creditBalance = 0
        ticketBalance = 0
    }
}