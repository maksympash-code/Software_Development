package nullsafety

import kotlin.concurrent.thread


var person: Person? = null

fun villain(){
    thread {
        person = null
    }
}

fun main() {

//    var person: Person = Person("Mykola", "Ilchuk", 20)
//    person = null // ця операція неможлива, бо ми вказали, що person типу Person

    person = Person("Mykola", "Ilchuk", 20)

//    person.name // оператор . не доступний, бо обʼєкт може бути null
//    person?.name

    for (i in 1..100) println("Hello!")

    println(person?.name)


    villain()
    if (person != null) {
        val ptmp = person
        println(ptmp?.name)
    }
}