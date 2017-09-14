package com.poker

import com.poker.model.Card
import com.poker.model.Hand
import kotlin.test.assertEquals
import org.junit.Test

class AppTest {

    @Test fun processHand() {
        val cardNameAndSuits = "9C 3H 9S 9H 3S"
        val handName = "Full house"
        val expectedOutput = cardNameAndSuits + " => " + handName
        val resultName = com.poker.processHand(cardNameAndSuits)
        assertEquals(expectedOutput,resultName)
    }
}