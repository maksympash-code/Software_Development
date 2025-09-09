package HW_2


import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toLong()

    if (n >= 13)
        println(3 * (n * n * n) + 4 * (n * n) + 5 * n + 6)
    else
        println(3 * (n * n * n) - 2 * (n * n) - 3 * n - 4)
}