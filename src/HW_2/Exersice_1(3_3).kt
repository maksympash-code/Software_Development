package HW_2

fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words){
        if (word.first() in "l")
            println(word)
    }
}