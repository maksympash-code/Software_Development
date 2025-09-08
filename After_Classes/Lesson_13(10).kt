fun main() {
    val num = 23
    val res = secondDigit(num)
    println("$num second digit is $res")
}

fun secondDigit(num: Int): Int{
    return num % 10
}