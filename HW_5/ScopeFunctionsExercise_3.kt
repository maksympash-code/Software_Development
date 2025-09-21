package Practice_5

fun createArray(n: Int, maxValue: Int): IntArray? {
    if (n <= 0 || maxValue <= 0) return null

    val array = IntArray(n){(1..maxValue).random()}

    return array
}

fun main() {
    val maxValue = 100500
    val arr = createArray(5, maxValue)

    arr?.let {
        for (i in it.indices){
            it[i] = if (it[i] % 2 == 1) it[i] * 2 else it[i] / 2
        }
        println(it.contentToString())
    }.also {
        val max = arr?.maxOrNull()
        println("Max value: $max")
    }

}