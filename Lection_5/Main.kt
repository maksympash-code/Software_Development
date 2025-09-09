package dataclasses

fun main() {
    val person1 = dataclasses.Person("Maksym", "Pashchenko", 19)
    val person2 = dataclasses.Person("Maksym", "Pashchenko", 19)
    kotlin.io.println(person1)


    kotlin.io.println(person1 === person2)
    kotlin.io.println(person1 == person2)

//    val person3 = person1
//    println(person3 === person1) // порівняння посилань
//    println(person3 == person1) // порівняння контенту

    val (name1, lastName1, age1) = person1
    kotlin.io.println("$name1 $lastName1 $age1")

    val newPerson = person1.copy()
    kotlin.io.println(newPerson)
    kotlin.io.println("ref: ${newPerson === person1}")
    kotlin.io.println("ref: ${newPerson == person1}")

    val person3 = person1.copy(age = 25)
    kotlin.io.println(person3)
}