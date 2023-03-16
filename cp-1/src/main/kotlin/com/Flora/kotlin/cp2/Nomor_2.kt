package com.Flora.kotlin.cp2

fun main() {
    while (true) {
        val number = readLine()!!.trim()
        if (number == "0") break
        val sum = number.mapIndexed { i, c ->
            val digit = c.toInt() - '0'.toInt()
            if (i % 2 == 0) digit else -digit
        }.sum()
        if (sum % 11 == 0) {
            println("$number is a multiple of 11.")
        } else {
            println("$number is not a multiple of 11.")
        }
    }
}

