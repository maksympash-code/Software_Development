fun main() {
    val num = 25
    val res = fd(num) + sd(num)
    println("$num = $res")
}

fun fd(num: Int): Int{
    return num / 10
}

fun sd(num: Int): Int{
    return num % 10
}