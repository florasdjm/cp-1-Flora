package com.Flora.kotlin.cp2

fun main() {
    val t = readLine()!!.toInt() // number of test cases
    for (i in 1..t) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        var sum = 0
        for (j in a..b) {
            if (j % 2 != 0) { // check if number is odd
                sum += j
            }
        }
        println("Case $i: $sum")
    }
}
