package HW_3

fun stringFilter(lst: List<String>, fn: (String) -> Boolean): List<String>{
    var res = mutableListOf<String>()
    lst.forEach { if (fn(it)) res.add(it)}
    return res
}

fun main() {
    val data = listOf("hello", "abc123", "noDigits", "42", "test5")

    val result = stringFilter(data) { str ->
        str.any { it.isDigit() }
    }

    println(result)
}