package oop

fun main() {

    val person0 = Person("Maksym", "Pashchenko", 19)
    val person1 = Person()
    val person2 = Person("Maksym")
//    val person2 = Person("Andrii", "Krenevych", 20)

    println(person0)
    println(person1)
    println(person2)


    person0.name = "Egor"
    person0.name = ""
    println(person0.name)

//    person0.id = 100500 // Error: private setter
    println(person0.id)
}