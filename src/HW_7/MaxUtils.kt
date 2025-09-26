package HW_7

import kotlin.math.abs

fun <T> maxByMeasureAllSafe(items: List<T>, value: (T) -> Double, eps: Double = 1e-9): Pair<Double, List<T>> {
    val pairs = items.mapNotNull { runCatching { it to value(it) }.getOrNull() }
    if (pairs.isEmpty()) return Double.NEGATIVE_INFINITY to emptyList()
    val best = pairs.maxOf { it.second }
    val group = pairs.filter { kotlin.math.abs(it.second - best) <= eps }.map { it.first }
    return best to group
}
