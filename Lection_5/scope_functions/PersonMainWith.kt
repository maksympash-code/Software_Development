package scope_functions

fun main() {
    val person = Person()

    with(person) {
        name = "Egor"
        lastName = "Ignatenko"
        age = 20
    }

    val resultFromWith = with(person){
        println(name)
        println(lastName)
        println(age)

        // результатом лямбда функцію вважається результат останнього оператора у її тілі

        "$name $lastName $age" // результат лямбда функції з with
    }

    println("resultFromWith = $resultFromWith")

//    println(person)
}