package com.example.kotlinbasic.kotlin

import java.util.*

fun main(): Unit {
    printHello();
    printSomething(190.3)
    println(getTwoSumDigit(2, 3))
    println(
        getSomething("Thiha Thant Sin")
    )
}


fun printHello(): Unit {
    println("Hello");
}

fun printSomething(number: Number) {
    println("Print===>$number")
}

fun getTwoSumDigit(value1: Int, value2: Int): Int = value1 + value2


fun getSomething(name: String): String {
    val result = name.trim();
    return result;
}