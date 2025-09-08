fun main() {
    val x = 5
    val y = 12
    val res = min(x, y)
    println("$x, $y min $res")
}

fun min(x: Int, y: Int): Int{
    return if (x < y) x else y
}