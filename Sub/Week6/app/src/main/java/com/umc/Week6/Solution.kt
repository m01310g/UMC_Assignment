package com.umc.Week6

class Week6 {
    fun boj10815() {
        val n = readln().toInt()
        // set으로 저장하여 빠르게 요소 확인 가능
        val myArr = readln().split(" ").map { it.toInt() }.toSet()

        val m = readln().toInt()
        val cmpArr = readln().split(" ").map { it.toInt() }

        val resultArr = IntArray(m) { 0 }

        for (i in cmpArr.indices) { // indices -> 0..m-1
            if (cmpArr[i] in myArr) {
                resultArr[i] = 1
            } else {
                resultArr[i] = 0
            }
        }
        print(resultArr.joinToString(" "))
    }

    fun boj11478() {
        val s = readln()
        val subSet = mutableSetOf<String>()

        for (start in 0..s.length) {
            for (end in start+1..s.length) {
                subSet.add(s.substring(start, end))
            }
        }
        print(subSet.size)
    }

    fun boj1269() {
        val (n, m) = readln().split(" ").map { it.toInt() }
        val setA = readln().split(" ").map { it.toInt() }
        val setB = readln().split(" ").map { it.toInt() }

        print(setA.subtract(setB).union(setB.subtract(setA)).size)
    }

    fun boj1620() {
        val (n, m) = readln().split(" ").map { it.toInt() }
        val pokemonArr = arrayListOf<String> ()
    }
}

fun main() {
//    Week6().boj10815()
//    Week6().boj11478()
//    Week6().boj1269()
}