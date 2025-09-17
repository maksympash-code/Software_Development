package AfterClasses

fun parseInt(str: String): Int?{
    return str.toIntOrNull()
}

fun main() {
    val arr = listOf("1", "2", "abc", "3")
    val numbers = arr.mapNotNull { parseInt(it) }
    println(numbers.sum())
}