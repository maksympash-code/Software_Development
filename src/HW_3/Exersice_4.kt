package HW_3


fun countString(lst: List<String>, fn: (String) -> Boolean): Int{
    return lst.count { fn(it) }
}


fun main() {
    val example = listOf("hello", "abc123", "noDigits", "42", "test5")

    val result = countString(example) { str ->
        str.any { it.isDigit() }
    }

    println("Кількість рядків з цифрами: $result")
}