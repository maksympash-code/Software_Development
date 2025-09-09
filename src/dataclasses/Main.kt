package dataclasses

fun main() {
    val person1 = Person("Maksym", "Pashchenko", 19)
    val person2 = Person("Maksym", "Pashchenko", 19)
    println(person1)


    println(person1 === person2)
    println(person1 == person2)

//    val person3 = person1
//    println(person3 === person1) // порівняння посилань
//    println(person3 == person1) // порівняння контенту

    val (name1, lastName1, age1) = person1
    println("$name1 $lastName1 $age1")

    val newPerson = person1.copy()
    println(newPerson)
    println("ref: ${newPerson === person1}")
    println("ref: ${newPerson == person1}")

    val person3 = person1.copy(age = 25)
    println(person3)
}