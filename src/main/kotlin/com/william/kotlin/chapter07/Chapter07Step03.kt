package com.william.kotlin.chapter07

fun main() {
    var nickname: String? = "W"
//    nickname = null

    val realName = nickname ?: "Guest"
    println("사용자: $realName")
}