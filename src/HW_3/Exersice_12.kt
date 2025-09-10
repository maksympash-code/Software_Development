package HW_3

fun main() {
    val n = readLine()!!.toInt()
    val numbers = readLine()!!
        .split(" ")
        .map { it.toInt() }

    val res = numbers.map { if (it >= 0) it + 2 else it}
    println(res.joinToString(" "))
}