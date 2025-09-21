package Practice_6

fun validateStock(requested: Int?, available: Int?): Int {
    val requested = requested ?: return -1
    val available = available ?: return -1

    if (requested < 0) return -1
    if (available < requested) return -1

    return requested
}

fun main() {
    println(validateStock(5,10))
    // 5
    println(validateStock(null,10))
    // -1
    println(validateStock(-2,10))
    // -1
}