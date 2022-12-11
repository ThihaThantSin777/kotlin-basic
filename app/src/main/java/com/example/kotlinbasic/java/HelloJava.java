package com.example.kotlinbasic.java;

public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Hello Java");

        ///Same with val
        final String value="Read Only";
       // value="Write Data";


        ///Same with var
        String data="Data";
        data="Write Data";

        Person.getPersonInfo();
    }
}
