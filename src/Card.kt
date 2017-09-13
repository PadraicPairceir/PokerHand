import java.util.*

class Card(val name: String, val suit: String) {
    private val names = arrayOf("2","3","4","5","6","7","8","9","T","J","Q","K","A")
    private val suits = arrayOf("H","D","S","C")

    val nameIndex: Int
    val suitIndex: Int

    init {
        // TODO : Can this be improved?
        suitIndex = Arrays.asList(*suits).indexOf(suit)
        nameIndex = Arrays.asList(*names).indexOf(name)
    }

    override fun toString(): String {
        return names[nameIndex] + suit[suitIndex]
    }
}