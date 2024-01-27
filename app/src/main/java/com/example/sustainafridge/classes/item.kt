package com.example.sustainafridge.classes

class Item {
    enum class Remaining {
        FULL,
        SEVENTYFIVE,
        FIFTY,
        TWENTYFIVE,
        EMPTY
    }
    private var name : String = ""
    private var portion : Remaining = Remaining.FULL
    private var owner : String = ""

}