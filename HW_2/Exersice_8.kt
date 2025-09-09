package HW_2

import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false

    for (i in 2..sqrt(num.toDouble()).toInt()){
        if (num % i == 0) return false
    }

    return true
}


fun main() {
    val num = 11

    print(isPrime(num))
}