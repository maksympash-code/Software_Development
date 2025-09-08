fun main() {
    val x = 3
    val y = 5
    val z = 8
    val result = ma(x, y, z)
    println("%.2f".format(result) + " ma to $x, $y, $z")
}

fun ma(x: Int, y: Int, z: Int): Float{
    return (x + y + z).toFloat() / 3
}