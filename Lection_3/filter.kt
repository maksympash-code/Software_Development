package functions

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

//    val positives = numbers.filter ({ x -> x > 0 })

    val positives = numbers.filter { it > 0 }

    numbers
        .filter { it > 0 }
        .map { it * it }
        .forEach { println(it) }

//    println(positives)
//    println(squares)
}