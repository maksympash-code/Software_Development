package HW_2

fun main() {
    var numbers = (1..100).toMutableList()

    for (num in numbers){
        when {
            num % 3 == 0 && num % 5 == 0 -> println("fizzbuzz")
            num % 3 == 0 -> println("fizz")
            num % 5 == 0 -> println("buzz")
            else -> println(num)
        }
    }
}