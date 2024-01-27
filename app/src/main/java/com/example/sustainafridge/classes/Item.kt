package com.example.sustainafridge.classes
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sustainafridge.databinding.ActivityMainBinding

enum class Remaining {
    FULL,
    SEVENTYFIVE,
    FIFTY,
    TWENTYFIVE,
    EMPTY
}
class Item(var name: String) {
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