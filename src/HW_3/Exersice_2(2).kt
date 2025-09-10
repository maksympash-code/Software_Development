package HW_3

fun repeatN(n: Int, action: () -> Unit) {
    repeat(n) { action() }
}

fun main() {
    val n = 5
    val action = "Hello"
    repeatN(n) { println("$action ") }
}