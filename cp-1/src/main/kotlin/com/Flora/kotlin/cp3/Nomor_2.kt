package com.Flora.kotlin.cp3

fun main() {
    val t = readLine()!!.toInt() // read number of test cases
    repeat(t) { case ->
        val n = readLine()!!.split(" ").last().toInt() // read matrix dimension
        val matrix = Array(n) { IntArray(n) } // initialize matrix
        for (i in 0 until n) {
            matrix[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray() // read matrix row
        }
        val symmetric = isSymmetric(matrix) // check if matrix is symmetric
        val result = if (symmetric) "Symmetric." else "Non-symmetric." // format output
        println("Test #${case + 1}: $result")
    }
}

fun isSymmetric(matrix: Array<IntArray>): Boolean {
    val n = matrix.size
    for (i in 0 until n) {
        for (j in i until n) {
            if (matrix[i][j] != matrix[j][i]) { // check if element is symmetric
                return false
            }
        }
    }
    return true
}











