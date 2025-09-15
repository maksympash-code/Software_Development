package scope_functions

fun main() {
//    val person = Person(
//        "Egor", "Ignatenko", 20
//    )

    val person = Person()

//    person.name = "Egor"
//    person.lastName = "Ignatenko"
//    person.age = 20
//
//    println(person.name)
//    println(person.lastName)
//    println(person.age)

//    println(person.name)
//    with(person){
//        println(name) // Заради одного розіменування сенсу використовувати оператор with немає.
//    }

//    val name = "Yaroslav"

    with(person){
//    this.name = name
        name = "Egor"
        lastName = "Ignatenko"
        age = 20

        println(name)
        println(lastName)
        println(age)
    }

//    println(person)
}