package HW_3

fun main() {
    val n = readLine()!!.toInt()
    val numbers = readLine()!!
        .split(" ")
        .map { it.toInt() }

    val evens = numbers.filter { it % 2 == 0 }
    val odds = numbers.filter { it % 2 != 0 }

    println("" + odds.sorted().joinToString(" ") + " " + evens.sortedDescending().joinToString(" "))
}