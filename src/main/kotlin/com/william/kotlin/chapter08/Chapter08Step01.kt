package com.william.kotlin.chapter08

fun main() {
    val fruits = listOf("apple", "banana", "cherry")
//    fruits[0] = "kiwi"      // ❌ error
    println(fruits[0])        // apple
    println(fruits.size)      // 3

    val mutableFruits = mutableListOf("apple", "banana")
    mutableFruits.add("cherry")
    mutableFruits.remove("banana")
    println(mutableFruits)    // [apple, cherry]
}