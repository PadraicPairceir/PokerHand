package com.poker.model

import kotlin.test.assertEquals
import org.junit.Test

class HandTest {

    @Test fun createHighCardHand() {
        val cardNameAndSuits = arrayOf("3H", "4H", "5D", "7S", "8C")
        val handName = "High card"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createOnePairHand() {
        val cardNameAndSuits = arrayOf("3H", "JS", "3C", "7C", "5D")
        val handName = "One pair"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createTwoPairHand() {
        val cardNameAndSuits = arrayOf("JH", "2C", "JD", "2H", "4C")
        val handName = "Two pair"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createThreeKindHand() {
        val cardNameAndSuits = arrayOf("9H", "9D", "3S", "9S", "6C")
        val handName = "Three of a kind"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createStraightHand() {
        val cardNameAndSuits = arrayOf("2C", "3C", "4H", "5C", "6C")
        val handName = "Straight"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createFlushHand() {
        val cardNameAndSuits = arrayOf("2C", "3C", "4C", "5C", "7C")
        val handName = "Flush"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createFullHouseHand() {
        val cardNameAndSuits = arrayOf("9C", "3H", "9S", "9H", "3S")
        val handName = "Full house"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createFourKindHand() {
        val cardNameAndSuits = arrayOf("9H", "9D", "3S", "9S", "9C")
        val handName = "Four of a kind"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createStraightFlushHand() {
        val cardNameAndSuits = arrayOf("2C", "3C", "4C", "5C", "6C")
        val handName = "Straight flush"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    @Test fun createRoyalFlushHand() {
        val cardNameAndSuits = arrayOf("AC", "KC", "QC", "JC", "TC")
        val handName = "Royal flush"
        val hand = Hand(createCards(cardNameAndSuits))
        assertEquals(handName, hand.pokerHandName)
    }

    private fun createCards(cardNameAndSuits: Array<String>): Array<Card> {
        val cards: MutableList<Card> = arrayListOf()
        for (cardNameAndSuit in cardNameAndSuits) {
            cards.add(Card(cardNameAndSuit))
        }
        return cards.toTypedArray()
    }
}