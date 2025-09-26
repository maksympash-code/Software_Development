package HW_7

import kotlin.math.*

data class Ball(val r: Double) : Figure {
    init { require(r > 0) }
    override val dimension = 3
    val volume get() = 4.0 / 3.0 * Math.PI * r * r * r
    override fun measure() = volume
    override fun pretty() = "Ball(r=$r, volume=${"%.4f".format(volume)})"
}

data class TriangularPyramid(val baseSide: Double, val h: Double) : Figure {
    init { require(baseSide > 0 && h > 0) }
    override val dimension = 3
    private val baseArea get() = sqrt(3.0)/4.0 * baseSide * baseSide
    val volume get() = baseArea * h / 3.0
    override fun measure() = volume
    override fun pretty() = "TriangularPyramid(side=$baseSide, h=$h, volume=${"%.4f".format(volume)})"
}

data class QuadrangularPyramid(val a: Double, val b: Double, val h: Double) : Figure {
    init { require(a > 0 && b > 0 && h > 0) }
    override val dimension = 3
    private val baseArea get() = a * b
    val volume get() = baseArea * h / 3.0
    override fun measure() = volume
    override fun pretty() = "QuadrangularPyramid(a=$a, b=$b, h=$h, volume=${"%.4f".format(volume)})"
}

data class RectangularParallelepiped(val a: Double, val b: Double, val c: Double) : Figure {
    init { require(a > 0 && b > 0 && c > 0) }
    override val dimension = 3
    val volume get() = a * b * c
    override fun measure() = volume
    override fun pretty() = "RectangularParallelepiped(a=$a, b=$b, c=$c, volume=${"%.4f".format(volume)})"
}

data class Cone(val r: Double, val h: Double) : Figure {
    init { require(r > 0 && h > 0) }
    override val dimension = 3
    val volume get() = Math.PI * r * r * h / 3.0
    override fun measure() = volume
    override fun pretty() = "Cone(r=$r, h=$h, volume=${"%.4f".format(volume)})"
}

data class TriangularPrism(val a: Double, val b: Double, val c: Double, val h: Double) : Figure {
    init { require(listOf(a,b,c,h).all { it > 0 } && a+b>c && a+c>b && b+c>a) }
    override val dimension = 3
    private val baseArea: Double get() {
        val s = (a+b+c)/2.0
        return sqrt(max(0.0, s*(s-a)*(s-b)*(s-c)))
    }
    val volume get() = baseArea * h
    override fun measure() = volume
    override fun pretty() = "TriangularPrism(a=$a, b=$b, c=$c, h=$h, volume=${"%.4f".format(volume)})"
}
