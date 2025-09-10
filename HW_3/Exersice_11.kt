package HW_3

fun main() {
    val n = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()

    repeat(n){
        numbers.add(readLine()!!.toInt())
    }

    numbers.reverse()
    println(numbers.joinToString(" "))
}