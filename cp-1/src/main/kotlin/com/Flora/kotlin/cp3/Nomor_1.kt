package com.Flora.kotlin.cp3

fun main() {
    while (true) {
        val (n, m) = readLine()!!.split(" ").map(String::toInt)
        if (n == 0 && m == 0) break
        val nums = mutableListOf<Int>()
        repeat(n) { nums.add(readLine()!!.toInt()) }
        val sortedNums = sortNumbers(n, m, nums)
        println("$n $m")
        sortedNums.forEach { println(it) }
        println("0 0")
    }
}

fun sortNumbers(n: Int, m: Int, nums: List<Int>): List<Int> {
    val modMap = mutableMapOf<Int, MutableList<Int>>()
    nums.forEach { num ->
        val mod = num % m
        val modList = modMap.getOrPut(mod) { mutableListOf() }
        modList.add(num)
    }
    val sortedNums = mutableListOf<Int>()
    modMap.toSortedMap().forEach { (mod, modList) ->
        val (odds, evens) = modList.partition { it % 2 == 1 }
        sortedNums.addAll(odds.sortedDescending())
        sortedNums.addAll(evens.sorted())
    }
    return sortedNums
}
