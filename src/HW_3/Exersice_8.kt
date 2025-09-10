package HW_3

fun main() {
    val n = readLine()!!.toInt()
    val numbers = readLine()!!
        .split(" ")
        .map { it.toInt() }

    val res = numbers.filter { it > 0 && it % 6 == 0 }
    var s = 0

    res.forEach { s += it }
    print("" + res.size + " " + s)
}