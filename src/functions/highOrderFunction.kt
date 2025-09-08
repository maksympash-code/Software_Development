package functions

import kotlin.math.sin


fun table(xs: List<Double>, fn: (Double) -> Double){ // функція вищого порядку
    for (x in xs) {
        println("fn($x) = ${fn(x)}")
    }
}


fun main() {
//    val max2: (Int, Int) -> Int = { x: Int, y: Int -> if (x > y) x else y }

    val xs = listOf(0.0, Math.PI/6, Math.PI/4, Math.PI/3, Math.PI/2)
    table(xs, {x: Double -> x * x})


//    table(xs) {
//        x: Double ->
//        x * x
//    }

    table(xs) {
        it * it
    }


    println("====== sin ======")
//    table(xs, {x: Double -> sin(x)})
    table(xs, ::sin ) // посилання на об`єкт функції

    repeat(10){
        println(it)
    }
}