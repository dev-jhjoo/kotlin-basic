package com.william.kotlin.chapter07

fun main() {
    var nickname: String? = "W"
    nickname = null

    val length = nickname?.length
    println("닉네임 길이: $length")
}