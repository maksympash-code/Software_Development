package HW_3


fun main() {
    val n = readLine()!!.toInt()
    val numbers = readLine()!!
        .split(" ")
        .map { it.toDouble() }

    val res = numbers.filter { it > 0 }
    var s = 0.0
    res.forEach { s += it }

    if (res.isEmpty())
        println("Not Found")
    else
        println("%.2f".format(s / res.size))
}
