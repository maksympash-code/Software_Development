package HW_3

import kotlin.random.Random


fun main() {
    val arr = Array(100) { Random.nextInt(-100, 101) }
        .filter { it > 0 }
        .filter { it % 5 == 0 }
        .map { it * it }
        .sortedDescending()

    println("Max: ${arr.first()}, Min: ${arr.last()}")
    println(arr.joinToString(" "))
}