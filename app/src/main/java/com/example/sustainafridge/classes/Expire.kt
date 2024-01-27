package com.example.sustainafridge.classes

class Expire {
    val ExpireList = mapOf<String, Int>("milk" to 8, "eggs" to 21, "deli meat" to 5, "ground meat" to 2, "steak" to 4)

    // checks if given key is found in the map
    // otherwise we can have the user input an expiration date?
    fun InList(food: String): Boolean{
        return ExpireList.containsKey(food)
    }

    //getter for value from map from key(food type)
    // returns int of # of days until it expires
    // also i fr don't know why i needed that '?' by the return type
    fun DaysToExpire(food: String): Int? {
        return ExpireList[food]
    }
}