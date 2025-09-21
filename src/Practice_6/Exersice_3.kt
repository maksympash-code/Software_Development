package Practice_6

fun main() {
    val lst = listOf("3.14", null, "abc", "-2.5", "10", "42", "7.0")

    val res = lst.filterNotNull().mapNotNull { it.toDoubleOrNull() }.sum()
    val maxInt = lst.filterNotNull().mapNotNull { it.toIntOrNull() }.maxOrNull()

    println(res)
    println(maxInt)
}