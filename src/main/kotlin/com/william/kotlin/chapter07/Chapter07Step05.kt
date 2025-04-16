package com.william.kotlin.chapter07

fun main() {
    var nickname: String? = "W"
//    nickname = null

    nickname?.let {
        println("닉네임은 $it 입니다")
    }

}