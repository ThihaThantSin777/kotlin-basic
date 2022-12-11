package com.example.kotlinbasic.kotlin

class ITMan: Person(age = 23) {

    fun doSomething(){
        super.eat()
    }

    override fun sleep() {
        super.sleep()
    }
}