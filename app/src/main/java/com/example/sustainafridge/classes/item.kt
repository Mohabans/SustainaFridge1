package com.example.sustainafridge.classes

class item {
    enum class remaining {
        FULL,
        SEVENTYFIVE,
        FIFTY,
        TWENTYFIVE,
        EMPTY
    }
    private var name : String = ""
    private var portion : remaining = remaining.FULL
    private var owner : String = ""

}