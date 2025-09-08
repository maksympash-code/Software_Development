fun main() {
    val number = 86399
    toHours(number)
}

fun toHours(number: Int){
    println("$number - ${number / 3600}:${number % 3600 / 60}:${number % 60}")
}