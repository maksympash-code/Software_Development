package HW_2

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()

    println(
        when (n){
            1, 2, 12 -> "Winter"
            3, 4, 5 -> "Spring"
            6, 7, 8 -> "Summer"
            9, 10, 11 -> "Autumn"
            else -> "Wrong input"
        }
    )
}