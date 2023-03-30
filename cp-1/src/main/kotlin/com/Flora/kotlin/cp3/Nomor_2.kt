package com.Flora.kotlin.cp3

fun isSymmetric(matrix: Array<LongArray>): Boolean {
    val n = matrix.size
    // Check that all elements are non-negative
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (matrix[i][j] < 0) {
                return false
            }
        }
    }
    // Check that matrix is symmetric with respect to center
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (matrix[i][j] != matrix[n-i-1][n-j-1]) {
                return false
            }
        }
    }
    return true
}

fun main() {
    val t = readLine()!!.toInt()
    for (testCase in 1..t) {
        val n = readLine()!!.split(" ")[2].toInt()
        val matrix = Array(n) { LongArray(n) }
        for (i in 0 until n) {
            matrix[i] = readLine()!!.split(" ").map { it.toLong() }.toLongArray()
        }
        val result = if (isSymmetric(matrix)) "Symmetric." else "Non-symmetric."
        println("Test #$testCase: $result")
    }
}













