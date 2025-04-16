package com.william.kotlin.chapter01

fun main () {
    // type 명시 없이 자동 casting 가능
//        val name = "William"
//        var age = 36

    // type 명시 가능
    val name: String = "William"
    var age: Int = 36

    println("name: $name")
    println("age: $age")

    age += 1
    println("new age: $age")
}