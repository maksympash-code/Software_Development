package Practice_4

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

fun main() {
    val minSide = 5f
    val maxSide = 100f
    val eps = 1e-6f
    val triangleList = mutableListOf<Triangle>()

    repeat(100) {
        when (Random.nextInt(3)) {
            0 -> {
                // RANDOM
                val a = Random.nextFloat() * (maxSide - minSide) + minSide
                val b = Random.nextFloat() * (maxSide - minSide) + minSide

                val lower = max(abs(a - b) + eps, minSide)
                val upper = min(a + b - eps, maxSide)

                if (upper > lower) {
                    val c = Random.nextFloat() * (upper - lower) + lower
                    triangleList.add(Triangle(a, b, c))
                } else {
                    val s = max(a, b)
                    val t = min(a, b)
                    val c = t + (s - t) / 2
                    triangleList.add(Triangle(a, b, c))
                }
            }
            1 -> {
                // RIGHT
                val a = Random.nextFloat() * (maxSide - minSide) + minSide
                val b = Random.nextFloat() * (maxSide - minSide) + minSide
                triangleList.add(Triangle(a, b))
            }
            2 -> {
                // EQUILATERAL
                val a = Random.nextFloat() * (maxSide - minSide) + minSide
                triangleList.add(Triangle(a))
            }
        }
    }

    val maxArea = triangleList.maxOf { it.area }
    val biggest = triangleList.filter { abs(it.area - maxArea) <= eps }

    biggest.forEach { println(it) }
}