package HW_2

fun mul(num_1: Int, num_2: Int){
    var sum = 0
    if (num_1 > 0 && num_2 > 0){
        for (i in 1..num_1)
           sum += num_2
        println(sum)
    }
    else{
        println("Error")
    }
}

fun main(){
    val num_1 = 90
    val num_2 = 3

    mul(num_1, num_2)
}