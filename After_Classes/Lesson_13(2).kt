fun main() {
    val x = 10
    val y = 3
    val result = div(x, y)
    println("$x / $y = " + "%.2f".format(result))
}

fun div(x: Int, y: Int): Float{
    return x.toFloat() / y.toFloat()
}