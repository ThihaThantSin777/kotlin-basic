package com.example.kotlinbasic.kotlin

fun main(){
     val age=15;

    when(age){
        5->println("It is 5")
        !in 0..15->{
            println("under 16")
        }
        in 16..30->{
            println("under 30")
        }
        else->{
            println("Over 30")
        }
    }

    println()


    ///Normal For
    val numbers= listOf<Int>(10,20,30,40,50)
    for ( i in numbers){
        println("$i is number")
    }
    println()

    ///Index ony
    for(i in numbers.indices){
        println("Index===> $i")
    }
    println()

    ///Index and Value

    for((index,value) in numbers.withIndex()){
        println("Index===> $index and Value=====> $value")
    }
    println()

    for(i in 0..5){
        println("$i..")
    }
    println()

    for(i in 0..10 step 20){
        println("$i...")
    }
    println()

    for(i in 10 downTo 1){
        println("$i..")
    }
}