package com.william.kotlin.chapter03

fun main() {
    val fruit = "apple"
    println("과일 이름은 $fruit 입니다.")         // ✅ OK
    println("과일 이름은 ${fruit.uppercase()} 입니다.") // ✅ OK
}