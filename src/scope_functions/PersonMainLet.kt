package scope_functions

fun main() {
    val person = Person().apply {
            name = "Egor"
            lastName = "Ignatenko"
            age = 20
        }

    val resultFromLet = person.let{
        println(it.name)
        println(it.lastName)
        println(it.age)

        // результатом лямбда функцію вважається результат останнього оператора у її тілі

        "${it.name} ${it.lastName} ${it.age}" // результат лямбда функції з with
    }

    println("resultFromLet = $resultFromLet")
}