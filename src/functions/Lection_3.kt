package functions
//fun max(x: Int, y: Int): Int{
//    if (x > y){
//        return x
//    }
//    else{
//        return y
//    }
//}

//fun max(x: Int, y: Int): Int{
//    return if (x > y) x else y
//}

//fun max(x: Int, y: Int): Int = if (x > y) x else y

fun maxCustomKotlin(x: Int, y: Int) = if (x > y) x else y



fun main(){
    println(maxCustomKotlin(y = 3, x = 4))
}