package HW_2

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    if (n % 4 == 0 && n % 100 != 0)
        println("YES")
    else if (n % 400 == 0)
        println("YES")
    else
        println("NO")
}
