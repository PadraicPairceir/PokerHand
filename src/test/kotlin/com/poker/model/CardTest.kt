package com.poker.model

import kotlin.test.assertEquals
import org.junit.Test

class CardTest {

    @Test fun createCard() {
        val card = Card("2S")
        val cardTwoSuitIndex = 2
        val cardTwoNameIndex = 0
        assertEquals(card.suitIndex,cardTwoSuitIndex)
        assertEquals(card.nameIndex,cardTwoNameIndex)
    }
}