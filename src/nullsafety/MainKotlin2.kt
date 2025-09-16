package nullsafety

var person2: Person? = null

fun main() {
    person2 = Person().apply {
        name = "Egor"
        lastName = "Ignatenko"
        age = 20
    }.also {
        println(it.name)
        println(it.lastName)
        println(it.age)
    }

    val resultFromLet = person2?.let{
        println(it.name)
        println(it.lastName)
        println(it.age)

        "${it.name} ${it.lastName} ${it.age}"
    }

    println("resultFromLet = $resultFromLet")
}