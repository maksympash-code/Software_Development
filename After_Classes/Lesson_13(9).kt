fun main() {
    val num = 23
    val res = firstDigit(num)
    println("$num first digit is $res")
}

fun firstDigit(num: Int): Int{
    return num / 10
}