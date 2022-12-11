package com.example.kotlinbasic.kotlin

///Immutable List
val myList= listOf<Int>(1,2,3,4,5)

///Mutable List
val myListMutable= mutableListOf<Int>(6,7,8,9,10)

///Immutable Map
val myMap= mapOf<Int,String>(1 to "One",2 to "Two",3 to "Three")

///Mutable Map
val myMutableMap= mutableMapOf<Int,String>(4 to "Four",5 to "Five",6 to "Six")

///Immutable Set
val mySet= setOf<String>("Banana","Papaya","Apple","Grapes","Banana","Grapes","Dragon Fruit")
///Mutable Set
val myMutableSet= setOf<String>("Cherry","Mango","PineApple","Lemon","Avocado","PineApple","Lemon")



fun main(){
   // error
// myList.add

    myListMutable.add(11)
    println(myListMutable)

    //error
    //myMap.put..


    //myMutableMap.put(7,"Seven")
    myMutableMap[7] = "Seven"
    println(myMutableMap)


    println(mySet)
    println(myMutableSet)


}