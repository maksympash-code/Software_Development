package scope_functions

fun main() {
    val person = Person()

    with(person) {
        name = "Egor"
        lastName = "Ignatenko"
        age = 20
    }

    val resultFromRun = person.run{
        println(this.name)
        println(lastName)
        println(age)

        // результатом лямбда функцію вважається результат останнього оператора у її тілі

        "${name} ${lastName} ${this.age}" // результат лямбда функції з with
    }

    println("resultFromRun = $resultFromRun")

//    println(person)
}