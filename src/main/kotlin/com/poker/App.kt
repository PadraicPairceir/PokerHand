package com.poker

import com.poker.model.Card
import com.poker.model.Hand
import java.io.File

fun main(args: Array<String>) {

    println("Determining Poker Hands");

    File("/home/padraic-strator/IdeaProjects/PokerHand/src/main/res/pokerHands.txt").forEachLine { processHand(it) }
}

fun processHand(line: String) {
    var cardList: MutableList<Card> = arrayListOf()

    for(word in line.split(" "))
        cardList.add(Card(word))

    var cards = cardList.toTypedArray()
    if ( cards.size == 5)
        println(Hand(cards).toString())
    else
        println("Error in file line: " + line)
}