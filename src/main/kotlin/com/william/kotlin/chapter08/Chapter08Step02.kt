package com.william.kotlin.chapter08

fun main() {
    val user = mapOf("name" to "William", "age" to 35)
    println(user["name"])     // William

    val scores = mutableMapOf("math" to 90, "eng" to 80)
    scores["sci"] = 85
    scores.remove("math")
    println(scores)           // {eng=80, sci=85}
}