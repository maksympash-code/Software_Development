package HW_7

import kotlin.math.*

data class Triangle(val a: Double, val b: Double, val c: Double) : Figure {
    init { require(a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) }
    override val dimension = 2
    val p get() = a + b + c
    val area: Double get() {
        val s = p / 2.0
        return sqrt(max(0.0, s * (s - a) * (s - b) * (s - c)))
    }
    override fun measure() = area
    override fun pretty() = "Triangle(a=$a, b=$b, c=$c, area=${"%.4f".format(area)})"
}

data class Rectangle(val a: Double, val b: Double) : Figure {
    init { require(a > 0 && b > 0) }
    override val dimension = 2
    val area get() = a * b
    override fun measure() = area
    override fun pretty() = "Rectangle(a=$a, b=$b, area=${"%.4f".format(area)})"
}

data class Trapeze(val A: Double, val B: Double, val C: Double, val D: Double) : Figure {
    init {
        require(listOf(A, B, C, D).all { it > 0 }) { "Sides must be positive" }
        require(A != B) { "Bases must be different to define height by sides" }
    }

    override val dimension = 2

    // Обчислюємо висоту в init і зберігаємо як поле
    private val h: Double

    init {
        val diff = B - A
        // Якщо diff дуже малий, формула стане нестійкою; але A!=B вже перевірено
        val x = ((C * C - D * D) + diff * diff) / (2.0 * diff)
        val h2 = C * C - x * x
        require(h2 > 0) { "Invalid trapeze parameters: imaginary height" }
        h = kotlin.math.sqrt(h2)
    }

    val area get() = (A + B) * 0.5 * h
    override fun measure() = area
    override fun pretty() = "Trapeze(A=$A, B=$B, C=$C, D=$D, area=${"%.4f".format(area)})"
}


data class Parallelogram(val a: Double, val b: Double, val h: Double) : Figure {
    init { require(a > 0 && b > 0 && h > 0) }
    override val dimension = 2
    val area get() = a * h
    override fun measure() = area
    override fun pretty() = "Parallelogram(a=$a, b=$b, h=$h, area=${"%.4f".format(area)})"
}

data class Circle(val r: Double) : Figure {
    init { require(r > 0) }
    override val dimension = 2
    val area get() = Math.PI * r * r
    override fun measure() = area
    override fun pretty() = "Circle(r=$r, area=${"%.4f".format(area)})"
}
