package arcade

class Terminal {

    fun addCredits(playerCard: Card, money: Int) {
        playerCard.creditBalance += money*2
    }
    fun checkBalance(playerCard: Card) {
        println("Card ID: "+playerCard.cardID)
        println("Credits remaining: "+playerCard.creditBalance)
        println("Tickets remaining: "+playerCard.ticketBalance)
    }
    fun transferCredits(senderCard: Card, receiverCard: Card) {
        receiverCard.creditBalance += senderCard.creditBalance
        senderCard.creditBalance = 0
    }
    fun transferTickets(senderCard: Card, receiverCard: Card) {
        receiverCard.ticketBalance += senderCard.ticketBalance
        senderCard.ticketBalance = 0
    }
    fun requestPrize(item: String, playerCard: Card) {
        val prizeInstance = PrizeCategory()
        val position = prizeInstance.prizes[0].indexOf(item.lowercase())
        val cost = prizeInstance.prizes[1][position] as Int
        val inventory = prizeInstance.prizes[2][position] as Int
        if (playerCard.ticketBalance < cost) {
            println("Insufficient tickets...")
        }
        else if (inventory <= 0) {
            println("No stock available...")
        }
        else {
            playerCard.ticketBalance -= cost
            prizeInstance.prizes[2][position] = inventory - 1
            println("Enjoy your prize!\n"+"There are "+(inventory - 1)+" "+item+"remaining")
        }
    }
}