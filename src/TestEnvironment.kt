import arcade.Card

fun main() {
    val card1 = Card()
    val card2 = Card()
    val card3 = Card()
    println("Card: "+card1.cardID+"\nCredits: "+card1.creditBalance+"\nTickets: "+card1.ticketBalance)
    println("Card: "+card2.cardID+"\nCredits: "+card2.creditBalance+"\nTickets: "+card2.ticketBalance)
    println("Card: "+card3.cardID+"\nCredits: "+card3.creditBalance+"\nTickets: "+card3.ticketBalance)
}