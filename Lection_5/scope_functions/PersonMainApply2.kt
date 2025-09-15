package scope_functions

fun main() {
    val person = Person()
        .apply {
            name = "Egor"
            lastName = "Ignatenko"
            age = 20
            // return this apply повертає контекстний обʼєкт
        }.apply {
            println(name)
            println(lastName)
            println(age)
        }.apply {
            println("${name} ${lastName} ${age}")
        }


    println(person)
}