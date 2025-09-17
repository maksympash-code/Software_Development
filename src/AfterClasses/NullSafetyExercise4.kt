package AfterClasses

fun safeLenght(text: String?): Int = text?.length ?: 0;

fun main() {
    val name: String? = "Kotlin"

    println(safeLenght(name))
}