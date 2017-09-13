fun main(args: Array<String>) {

    val hand0: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("3","H"),Card("4","H"),Card("5","D"),Card("7","S"),Card("8","C")))
    val hand1: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("3","H"),Card("J","S"),Card("3","C"),Card("7","C"),Card("5","D")))
    val hand2: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("J","H"),Card("2","C"),Card("J","D"),Card("2","H"),Card("4","C")))
    val hand3: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("9","H"),Card("9","D"),Card("3","S"),Card("9","S"),Card("6","C")))
    val hand4: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("9","H"),Card("9","D"),Card("3","S"),Card("9","S"),Card("9","C")))
    val hand5: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("9","C"),Card("3","H"),Card("9","S"),Card("9","H"),Card("3","S")))
    val hand6: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("2","C"),Card("3","C"),Card("4","H"),Card("5","C"),Card("6","C")))
    val hand7: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("2","C"),Card("3","C"),Card("4","C"),Card("5","C"),Card("7","C")))
    val hand8: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("2","C"),Card("3","C"),Card("4","C"),Card("5","C"),Card("6","C")))
    val hand9: JavaHandKotlin = JavaHandKotlin(arrayOf(Card("A","C"),Card("K","C"),Card("Q","C"),Card("J","C"),Card("T","C")))

    println("Determining Poker Hand");
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