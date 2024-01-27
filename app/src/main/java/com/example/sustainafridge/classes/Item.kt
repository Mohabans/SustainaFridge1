package com.example.sustainafridge.classes


enum class Remaining {
    FULL,
    SEVENTYFIVE,
    FIFTY,
    TWENTYFIVE,
    EMPTY
}
class Item(val name: String) {
    var portion: Remaining = Remaining.FULL
        private set

    var owner: String = ""
        private set

    fun useItem(usedPortion: Remaining) {
        portion = usedPortion
    }

    fun assignOwnership(newOwner: String) {
        owner = newOwner
    }

}

fun main() {
    val milk = Item("Milk")


    milk.assignOwnership("Noah")

}