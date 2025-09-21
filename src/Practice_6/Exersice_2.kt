package Practice_6

fun main() {
    val lst = listOf("sdfefsf", null, "sdfaffqw", null, "sdfasdf")
    val res = lst.filterNotNull()
        .sumOf { it.length }

    println(res)

}