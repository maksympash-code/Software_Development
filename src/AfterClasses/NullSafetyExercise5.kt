package AfterClasses

fun main() {
    val numbers: List<Int?> = listOf(1, null, 3, null, 5);
    val newList = numbers.filterNotNull();
    println(newList)

}