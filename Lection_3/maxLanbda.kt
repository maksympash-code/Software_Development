package functions

fun main() {
    val max2: (Int, Int) -> Int = { x: Int, y: Int -> if (x > y) x else y }

    println(max2(3, 4))

    val x: Int = 12
}