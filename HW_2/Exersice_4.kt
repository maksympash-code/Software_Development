package HW_2

import kotlin.math.sqrt

fun absInt(n: Int): Int = if (n < 0) -n else n
fun absFloat(n : Float): Float = if (n < 0) -n else n
fun absComplex(re: Double, im: Double): Double = sqrt(re * re + im * im)

fun main(){
    val nFloat = -1.3253345f
    val nInt = -12345
    val nC_1 = 3.0
    val nC_2 = 4.0

    println("absInt($nInt) = ${absInt(nInt)}")
    println("absFloat($nFloat) = ${absFloat(nFloat)}")
    println("absComplex($nC_1, $nC_2) = ${absComplex(nC_1.toDouble(), nC_2.toDouble())}")

}