package HW_7

data class ParseStats(
    var parsed: Int = 0,
    val reasons: MutableMap<String, Int> = mutableMapOf()
)

fun parseFigures(lines: List<String>, stats: ParseStats = ParseStats()): List<Figure> {
    fun mark(reason: String) { stats.reasons.merge(reason, 1, Int::plus) }
    val out = mutableListOf<Figure>()
    for (line in lines) {
        val parts = line.trim().split(Regex("\\s+")).filter { it.isNotEmpty() }
        if (parts.isEmpty()) { mark("empty"); continue }
        fun num(i: Int) = parts.getOrNull(i)?.toDoubleOrNull()

        try {
            val fig = when (parts[0]) {
                "Triangle" -> Triangle(num(1)!!, num(2)!!, num(3)!!)
                "Rectangle" -> Rectangle(num(1)!!, num(2)!!)
                "Trapeze" -> Trapeze(num(1)!!, num(2)!!, num(3)!!, num(4)!!)
                "Parallelogram" -> Parallelogram(num(1)!!, num(2)!!, num(3)!!)
                "Circle" -> Circle(num(1)!!)
                "Ball" -> Ball(num(1)!!)
                "TriangularPyramid" -> TriangularPyramid(num(1)!!, num(2)!!)
                "QuadrangularPyramid" -> QuadrangularPyramid(num(1)!!, num(2)!!, num(3)!!)
                "RectangularParallelepiped" -> RectangularParallelepiped(num(1)!!, num(2)!!, num(3)!!)
                "Cone" -> Cone(num(1)!!, num(2)!!)
                "TriangularPrism" -> TriangularPrism(num(1)!!, num(2)!!, num(3)!!, num(4)!!)
                else -> { mark("unknown type"); null }
            }
            if (fig != null) { out += fig; stats.parsed++ }
        } catch (e: NullPointerException) { mark("not enough params") }
        catch (e: NumberFormatException) { mark("bad number") }
        catch (e: IllegalArgumentException) { mark(e.message ?: "failed requirement") }
    }
    return out
}
