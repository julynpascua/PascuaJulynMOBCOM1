package com.example.pascuajulynmobcom1

fun main(){
    //1. Declare an immutable variable b and initialize it with a value. Compiler should be able to infer it to be of type Int
    val b=128
    println("$b")
    //2. Explicitly declare an immutable float variable weight and initialize it with any value
    val weight = 3.14f
    println("$weight")
    //3. Declare an immutable variable which will be assigned the value "lbs"
    val pounds: Number
    val lbs=128
    pounds = lbs
    println("$pounds")
    //4. Declare a variable patient without initialization.
    var patient: String
    //5. Assign your name to variable patient
    patient="Julyn"
    println("$patient")
    //6. Declare a variable age.
    var age: Int
    //7. Declare a mutable variable which will be initialized to 0x730d06
    var a = "0x730d06"
    println("$a")
    //8. Explicitly declare a variable aVAR that will only hold 16 bit of data
    var aVar: Char
}