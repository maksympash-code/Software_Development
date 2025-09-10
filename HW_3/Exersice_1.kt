package HW_3

fun main() {
    val num1 = 2
    val num2 = 3
    var s = 0 // repeat
    var res = 0 // forEach

    repeat(num1){
        s += num2
    }

    (1..num1).forEach{
        res += num2
    }

    println(s)
    println(res)
}