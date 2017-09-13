fun main(args: Array<String>) {

    val hand0: Hand = Hand(arrayOf(Card("3","H"),Card("4","H"),Card("5","D"),Card("7","S"),Card("8","C")))
    val hand1: Hand = Hand(arrayOf(Card("3","H"),Card("J","S"),Card("3","C"),Card("7","C"),Card("5","D")))
    val hand2: Hand = Hand(arrayOf(Card("J","H"),Card("2","C"),Card("J","D"),Card("2","H"),Card("4","C")))
    val hand3: Hand = Hand(arrayOf(Card("9","H"),Card("9","D"),Card("3","S"),Card("9","S"),Card("6","C")))
    val hand4: Hand = Hand(arrayOf(Card("9","H"),Card("9","D"),Card("3","S"),Card("9","S"),Card("9","C")))
    val hand5: Hand = Hand(arrayOf(Card("9","C"),Card("3","H"),Card("9","S"),Card("9","H"),Card("3","S")))
    val hand6: Hand = Hand(arrayOf(Card("2","C"),Card("3","C"),Card("4","H"),Card("5","C"),Card("6","C")))
    val hand7: Hand = Hand(arrayOf(Card("2","C"),Card("3","C"),Card("4","C"),Card("5","C"),Card("7","C")))
    val hand8: Hand = Hand(arrayOf(Card("2","C"),Card("3","C"),Card("4","C"),Card("5","C"),Card("6","C")))
    val hand9: Hand = Hand(arrayOf(Card("A","C"),Card("K","C"),Card("Q","C"),Card("J","C"),Card("T","C")))

    println("Determining Poker Hand2");
    // TODO : Why not hand1.getPokerHandName() ?
    println(hand0.pokerHandName)
    println(hand1.pokerHandName)
    println(hand2.pokerHandName)
    println(hand3.pokerHandName)
    println(hand4.pokerHandName)
    println(hand5.pokerHandName)
    println(hand6.pokerHandName)
    println(hand7.pokerHandName)
    println(hand8.pokerHandName)
    println(hand9.pokerHandName)
}