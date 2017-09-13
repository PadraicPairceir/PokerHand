class Hand(val cards: Array<Card>) {
    val pokerHandName: String

    init {
        this.pokerHandName = determinePokerHandName()
    }

    private fun determinePokerHandName(): String {

        val nameCount = IntArray(13)
        var pokerHandName = HIGH_CARD_HAND

        for (i in 0..12) {
            nameCount[i] = 0
        }

        // Evaluate counts of each name
        for (i in 0..4) {
            nameCount[cards[i].nameIndex]++
        }

        pokerHandName = determinePairingCounts(nameCount)

        if (pokerHandName == HIGH_CARD_HAND) {
            pokerHandName = determineFlushStraight(nameCount)
        }

        return pokerHandName
    }

    // Evaluate Straight/Flush/SFlush/RFlush/High
    private fun determineFlushStraight(nameCount: IntArray): String {
        var pokerHandName = HIGH_CARD_HAND

        var isSameSuit = true
        var isStraight = false

        var lowCardName = 11
        var highCardName = 0
        var isCarryingAce = false
        var isAceHigh = false

        // Evaluate if cards are in same suit
        for (i in 0..3) {
            if (cards[i].suitIndex != cards[i + 1].suitIndex)
                isSameSuit = false
        }

        // Evaluate high and low cards and presence of Ace
        for (i in 0..11) {
            if (nameCount[i] > 0 && i < lowCardName)
                lowCardName = i
            if (nameCount[i] > 0 && i > highCardName)
                highCardName = i
        }
        if (nameCount[12] > 0) isCarryingAce = true

        if (highCardName - lowCardName == 3 && isCarryingAce) {
            if (highCardName == 11) {
                isStraight = true
                isAceHigh = true
            } else if (lowCardName == 0)
                isStraight = true
        } else if (highCardName - lowCardName == 4)
            isStraight = true

        if (!isStraight && !isSameSuit) {
        } else if (isStraight && !isSameSuit)
            pokerHandName = STRAIGHT_HAND
        else if (!isStraight && isSameSuit)
            pokerHandName = FLUSH_HAND
        else {
            if (isAceHigh)
                pokerHandName = ROYAL_FLUSH_HAND
            else
                pokerHandName = STRAIGHT_FLUSH_HAND
        }

        return pokerHandName
    }

    private fun determinePairingCounts(nameCount: IntArray): String {
        var pokerHandName = HIGH_CARD_HAND

        var countMajorMatchingCards = 1
        var countMinorMatchingCards = 1

        // Evaluate existence of pairs
        for (i in 0..12) {
            if (nameCount[i] > countMajorMatchingCards) {
                countMinorMatchingCards = countMajorMatchingCards
                countMajorMatchingCards = nameCount[i]
            } else if (nameCount[i] > countMinorMatchingCards) {
                countMinorMatchingCards = nameCount[i]
            }
        }

        if (countMajorMatchingCards == 3 && countMinorMatchingCards == 2)
            pokerHandName = FULL_HOUSE_HAND
        else if (countMajorMatchingCards == 4)
            pokerHandName = FOUR_KIND_HAND
        else if (countMajorMatchingCards == 3)
            pokerHandName = THREE_KIND_HAND
        else if (countMajorMatchingCards == 2 && countMinorMatchingCards == 2)
            pokerHandName = TWO_PAIR_HAND
        else if (countMajorMatchingCards == 2)
            pokerHandName = ONE_PAIR_HAND

        return pokerHandName
    }

    companion object {

        private val HIGH_CARD_HAND = "High Card"
        private val ONE_PAIR_HAND = "One Pair"
        private val TWO_PAIR_HAND = "Two Pair"
        private val THREE_KIND_HAND = "Three of a kind"
        private val STRAIGHT_HAND = "Straight"
        private val FLUSH_HAND = "Flush"
        private val FULL_HOUSE_HAND = "Full house"
        private val FOUR_KIND_HAND = "Four of a kind"
        private val STRAIGHT_FLUSH_HAND = "Straight flush"
        private val ROYAL_FLUSH_HAND = "Royal Flush"
    }
}