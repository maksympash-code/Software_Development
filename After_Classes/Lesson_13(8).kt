fun main() {
    val number = 3
    println(even(number))
}

fun even(number: Int): String{
    return if (number % 2 == 0) "$number is even" else "$number is odd"
}