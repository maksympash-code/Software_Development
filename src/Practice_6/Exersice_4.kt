package Practice_6

fun main() {
    val example = "1 + 2 - 3 + 4 * 5"

    val list = example.split(" ")
    var res = list[0].toDouble()

    for (i in 1 until list.size step 2){
        val operator = list[i]
        val number = list[i + 1].toDouble()
        when (operator){
            "+" -> res += number
            "-" -> res -= number
            "*" -> res *= number
            "/" -> {
                require(number != 0.0) { "Division by zero" }
                res /= number
            }
        }
    }
    println(res)
}