package HW_7

import java.io.File

private fun resolvePaths(
    names: List<String>,
    extraDirs: List<String> = listOf("/mnt/data/")
): List<String> {
    return names.map { name ->
        val direct = File(name)
        if (direct.exists()) return@map direct.absolutePath
        val foundInExtra = extraDirs
            .map { it.trimEnd('/') + "/" + name }
            .map { File(it) }
            .firstOrNull { it.exists() }
        (foundInExtra ?: direct).absolutePath
    }
}

fun main(args: Array<String>) {
    val defaultNames = listOf("input01.txt", "input02.txt", "input03.txt")
    val requested = if (args.isNotEmpty()) args.toList() else defaultNames
    val paths = resolvePaths(requested)

    for (path in paths) {
        val file = File(path)
        if (!file.exists()) {
            System.err.println("Cannot read \"$path\": ${file.name} (No such file or directory)")
            println("==== $path ====")
            println("Нема валідних фігур або файл відсутній.\n")
            continue
        }

        val lines = file.readLines()

        // ВАЖЛИВО: передаємо ВЕСЬ список рядків у parseFigures
        val stats = ParseStats()
        val figures = parseFigures(lines, stats)

        println("==== $path ====")
        println("Усього валідних фігур: ${figures.size}")
        if (stats.reasons.isNotEmpty()) {
            val skipped = lines.size - figures.size
            println("Пропущено: $skipped")
            stats.reasons.toSortedMap().forEach { (reason, count) ->
                println("  - $reason: $count")
            }
        }
        if (figures.isEmpty()) {
            println()
            continue
        }

        // пошук максимуму міри (площа для 2D / об’єм для 3D)
        val (maxMeasure, best) = maxByMeasureAllSafe(figures, Figure::measure, eps = 1e-7)

        println("Максимальна міра (площа для 2D / об’єм для 3D): ${"%.6f".format(maxMeasure)}")
        println("Фігури з максимумом:")
        best.forEachIndexed { idx, f -> println("${idx + 1}. ${f.pretty()} [dim=${f.dimension}]") }
        println()
    }
}
