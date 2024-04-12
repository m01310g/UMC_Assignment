package com.umc.week2

import kotlin.math.sqrt

class Week2 {
    fun sol2739() {
        val n = readln().toInt()

        for (i in 1..9) {
            println("$n * $i = ${n * i}")
        }
    }

    fun sol2438() {
        val n = readln().toInt()

        for (i in 1..n) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }

    fun sol10952() {
        while (true) {
            val num = readln().split(" ")
            val a = num[0].toInt()
            val b = num[1].toInt()

            if (a == 0 && b == 0) break
            println(a + b)
        }
    }

    fun jungol965() {
        val num = readln().split(" ")
        val m = num[0].toInt()
        val n = num[1].toInt()
        // var i = 1
        var res = 1

        for (i in 1..n) {
            res *= m
        }
        println(res)
    }

    fun jungol966() {
        val str = readln().split(" ")
        val a = str[0].toInt()
        val b = str[2].toInt()
        val s = str[1]
        var res = 0

        if (s == "+") {
            res = a + b
        } else if (s == "-") {
            res = a - b
        } else if (s == "*") {
            res = a * b
        } else if (s == "/") {
            res = a / b
        } else {
            res = 0
        }
        println("$a $s $b = $res")
    }

    fun sol11692() {
        val m = readln().toInt()
        println(m - sqrt(m.toDouble()).toInt() - sqrt((m/2).toDouble()).toInt())
    }
}

fun main() {
    Week2().sol2739()
    Week2().sol2438()
    Week2().sol10952()
    Week2().jungol965()
    Week2().jungol966()
    Week2().sol11692()
}
