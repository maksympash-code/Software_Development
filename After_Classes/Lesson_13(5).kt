fun main() {
    val x = 4
    val y = 1
    val z = 188
    val q = 29

    val res = isBiggest(x, y, z, q)
    println("$x, $y, $z, $q max $res")
}

fun isBiggest(a: Int, b: Int, c: Int, d: Int): Int{
    if (a > b && a > c && a > d) {
        return a
    }
    else if (b > a && b > c && b > d) {
        return b
    }
    else if (c > a && c > b && c > d) {
        return c
    }
    else {
        return d
    }
}