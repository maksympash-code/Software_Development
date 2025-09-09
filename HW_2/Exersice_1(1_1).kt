package HW_2

fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val countNumbers = greenNumbers.count() + redNumbers.count()

    println(countNumbers)
}