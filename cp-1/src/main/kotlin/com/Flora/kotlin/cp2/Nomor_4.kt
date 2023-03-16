package com.Flora.kotlin.cp2
fun main() {
    while (true) {
        val line = readLine()
        if (line == null) break // end of file
        val (n, m) = line.split(" ").map { it.toInt() }
        val sequence = mutableListOf<Int>()
        var x = n
        while (x != 1) {
            if (x % m != 0) {
                println("Boring!")
                break
            }
            sequence.add(x)
            x /= m
        }
        if (x == 1) {
            sequence.add(1)
            println(sequence.joinToString(" "))
        }
    }
}
