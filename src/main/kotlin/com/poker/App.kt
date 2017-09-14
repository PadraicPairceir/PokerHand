package com.poker

import com.poker.model.Card
import com.poker.model.Hand
import java.io.File

fun main(args: Array<String>) {

    println("Determining Poker Hands")

    File("/home/padraic-strator/IdeaProjects/PokerHand/src/main/res/pokerHands.txt").forEachLine { println(processHand(it)) }
}

fun processHand(line: String): String {
    val output: String
    val cardList: MutableList<Card> = arrayListOf()

    for(word in line.split(" "))
        cardList.add(Card(word))

    val cards = cardList.toTypedArray()
    if ( cards.size == 5)
        output = Hand(cards).toString()
    else
        output = "Error in file line: " + line

    return output
}