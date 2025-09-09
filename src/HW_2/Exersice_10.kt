import java.util.Scanner

fun reverse(n: String): String{
    var res = ""
    for (i in n.length - 1 downTo 0 step 1)
        res += n[i]

    return res
}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim()
    println(reverse(n))
}
