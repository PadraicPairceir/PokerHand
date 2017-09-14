package com.poker.model

import java.util.*

class Card(val nameAndSuit: String) {
    private val names = arrayOf("2","3","4","5","6","7","8","9","T","J","Q","K","A")
    private val suits = arrayOf("H","D","S","C")

    val nameIndex: Int
    val suitIndex: Int

    init {
        // TODO : Can this be improved?

        nameIndex = Arrays.asList(*names).indexOf(nameAndSuit.substring(0,1))
        suitIndex = Arrays.asList(*suits).indexOf(nameAndSuit.substring(1,2))
    }

    override fun toString(): String {
        return nameAndSuit
    }
}