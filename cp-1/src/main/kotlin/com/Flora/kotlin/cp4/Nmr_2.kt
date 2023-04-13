package com.Flora.kotlin.cp4

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val m = readLine()!!.toInt()
        val binary1 = Integer.toBinaryString(m)
        val b1 = binary1.count { it == '1' }
        val binary2 = Integer.toBinaryString(Integer.parseInt(m.toString(16), 16))
        val b2 = binary2.count { it == '1' }
        val result = m.xor(b1 * b2)
        println("$b1 $b2")
    }
}

