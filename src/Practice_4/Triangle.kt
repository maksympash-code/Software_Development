package Practice_4

import kotlin.math.hypot
import kotlin.math.sqrt

class Triangle(a: Float, b: Float, c: Float) {

    var a: Float = a
        set(value) {
            require(value > 0) { "Side $value is negative or zero" }
            require(checkTriangle(value, b, c)) { "Triangle inequality violated {$value, $b, $c}" }
            field = value
        }

    var b: Float = b
        set(value) {
            require(value > 0) { "Side $value is negative or zero" }
            require(checkTriangle(a, value, c)) { "Triangle inequality violated {$a, $value, $c}" }
            field = value
        }

    var c: Float = c
        set(value) {
            require(value > 0) { "Side $value is negative or zero" }
            require(checkTriangle(a, b, value)) { "Triangle inequality violated {$a, $b, $value}" }
            field = value
        }

    val perimeter: Float
        get() = a + b + c

    val semiPerimeter: Float
        get() = perimeter / 2f

    val area: Float
        get() = sqrt(
            semiPerimeter *
                    (semiPerimeter - a) *
                    (semiPerimeter - b) *
                    (semiPerimeter - c)
        )

    init {
        require(a > 0 && b > 0 && c > 0) { "Sides must be positive" }
        require(checkTriangle(a, b, c)) { "Triangle inequality violated {$a, $b, $c}" }
    }

    constructor(a: Int, b: Int, c: Int): this(a.toFloat(), b.toFloat(), c.toFloat())
    constructor(side: Float): this(side, side, side)
    constructor(side: Int): this(side.toFloat())
    constructor(a: Float, b: Float): this(a, b, c = hypot(a.toDouble(), b.toDouble()).toFloat())

    override fun toString(): String {
        return "Triangle(a=$a, b=$b, c=$c)"
    }

    private fun checkTriangle(a: Float, b: Float, c: Float): Boolean {
        return a + b > c && b + c > a && c + a > b
    }
}