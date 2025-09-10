package HW_3

fun main() {
    val input = readLine()!!

    val cleaned = input.replace(Regex("[^A-Za-z0-9]"), " ")

    val res = cleaned.split(" ").filter { it.isNotEmpty() }

    println(res.size)
}