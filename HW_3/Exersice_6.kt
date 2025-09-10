package HW_3

fun main() {
    val input = readLine()!!

    var d = mutableMapOf<Char, Int>()

    input.forEach { if (it in d) d[it] = d[it]!! + 1 else d[it] = 1}

//    for (i in input) {
//        if (i in d){
//            d[i] = d[i]!! + 1
//        }
//        else{
//            d[i] = 1
//        }
//    }

    println(d)
}