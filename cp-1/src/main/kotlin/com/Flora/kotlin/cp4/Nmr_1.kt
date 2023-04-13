package com.Flora.kotlin.cp4

fun main() {
    val primes = mutableSetOf<Int>()
    for (i in 2..1000000) {
        var isPrime = true
        for (j in 2..Math.sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes.add(i)
        }
    }
    while (true) {
        val line = readLine() ?: break
        val n = line.toInt()
        if (n !in primes) {
            println("$n is not prime.")
        } else if (isEmirp(n, primes)) {
            println("$n is emirp.")
        } else {
            println("$n is prime.")
        }
    }
}

fun isEmirp(n: Int, primes: Set<Int>): Boolean {
    val reversed = n.toString().reversed().toInt()
    return n != reversed && reversed in primes
}
