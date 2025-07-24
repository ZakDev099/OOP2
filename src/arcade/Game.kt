package arcade

class Game(val creditCost: Int) {

    fun play(playerCard: Card) {
        if (playerCard.creditBalance >= creditCost) {
            val ticketsWon: Int = (1..500).random()
            playerCard.creditBalance -= creditCost
            playerCard.ticketBalance += ticketsWon
            println("Card: "+playerCard.cardID+"\nTickets Won!: "+ticketsWon+"\nTotal Tickets: "+playerCard.ticketBalance)
        }
        else {
            println("Insufficient Credits...")
        }
    }
}