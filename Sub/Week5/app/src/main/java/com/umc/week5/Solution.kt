import java.util.Scanner

class Week5 {
    fun jungol9595() {
        val numArray = readln().split(" ")
        val length = numArray.size

        val arr = IntArray(10)

        for (i in 0..length-1) {
            val n = numArray[i].toInt() % 10
            arr[n] += 1
        }

        for (i in 0..9) {
            if (arr[i] != 0) {
                println("$i : ${arr[i]}개")
            }
        }
    }

    fun jungol9601() {
        var numList = mutableListOf(3, 5, 1, 10)
        println("lst: ${numList}")
        println("len(lst): ${numList.size}")
        numList.add(10)
        println("lst.append(10): ${numList}")
        numList.removeAt(numList.size-1)
        println("lst.pop(): ${numList}")
        numList = numList.reversed().toMutableList()
        println("lst.reverse(): ${numList}")
        numList = numList.sorted().toMutableList()
        println("lst.sort(): ${numList}")
        numList = numList.sortedDescending().toMutableList()
        println("lst.sort(reverse=True): ${numList}")
        numList.remove(1)
        println("lst.remove(1): ${numList}")
        numList.add(1, 5)
        println("lst.insert(1, 5): ${numList}")
        val tmp = mutableListOf(6, 2, 4)
        println("tmp: ${tmp}")
        numList = (numList + tmp).toMutableList()
        println("lst.extend(tmp): ${numList}")
        println("lst.count(5): ${numList.count{it == 5}}")
        println("lst.index(5): ${numList.indexOf(5)}")
//        numList.remove(numList.slice(1..3))
//        println("del(lst[1:3]): ${numList}")
    }

    fun boj2743() {
        var word = readln()
        print("${word.length}")
    }
    fun boj1152() {
        val sentence = readln().split(" ").toMutableList()
        sentence.removeAll(listOf(""))
        print("${sentence.size}")
    }
}

fun main() {
    Week5().jungol9595()
    Week5().jungol9601()
    Week5().boj2743()
    Week5().boj1152()
}