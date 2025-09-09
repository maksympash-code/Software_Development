package HW_2

import java.util.Scanner

fun factorial(n: Long): Long{
    if (n == 0L || n == 1L) return 1

    return n * factorial(n - 1)
}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toLong()

    val result = factorial(n)
    println(result)
}
