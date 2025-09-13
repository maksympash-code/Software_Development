package Practice_4

import kotlin.math.sqrt

class QuadraticEquation (a: Float, b:Float, c: Float){

    var a: Float = a
        get() = field
        set(value){
            require(value != 0f) {"Side $value is negative or zero"}
            field = value
        }

    var b: Float = b
        get() = field
        set(value){
            field = value
        }

    var c: Float = c
        get() = field
        set(value){
            field = value
        }

    val discriminant: Float
        get() = b * b - 4f * a * c

    init {
        require(a != 0f) {"Not a quadratic equation: a = 0"}
    }

    constructor(a: Int, b: Int, c: Int): this(a.toFloat(), b.toFloat(), c.toFloat())
    constructor(b: Float, c: Float): this(1f, b, c)


    override fun toString(): String {
        return "$a x^2 + $b x + $c = 0"
    }

    fun result(): List<Float>{
        if (discriminant < 0f) return listOf()
        else if (discriminant == 0f) return listOf(-b / (2f * a))
        else {
            val x1 = (-b + sqrt(discriminant)) / (2f * a)
            val x2 = (-b - sqrt(discriminant)) / (2f * a)
            return listOf(x1, x2)
        }
    }
}