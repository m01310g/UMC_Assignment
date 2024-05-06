class Week4 {
    fun sol9632() {
        var myname = "김민경"
        var myage = 24

        print("친한 친구의 이름과 나이를 입력하세요. ")
        var friend = readln().split(" ")

        println("당신의 이름: $myname, 나이: $myage")
        println("친구의 이름: ${friend[0]}, 나이: ${friend[1]}")
    }

    fun sol9631() {
        print("당신의 이름은 무엇입니까? ")
        var name = readln()
        print("당신의 나이는 몇 살입니까? ")
        var age = readln().toInt()

        println("당신의 이름은 ${name}이고 나이는 ${age}세이군요.")
    }
}

fun main() {
    Week4().sol9632()
    Week4().sol9631()
}