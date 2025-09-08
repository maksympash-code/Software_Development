package oop

class Person(
    val name: String = "",
    val lastName: String = "",
    val age: Int = 0
){

//    var name: String = ""
//    var lastName: String = ""
//    var age: Int = 0
//
//    constructor(name: String, lastName: String, age: Int){
//        this.name = name
//        this.lastName = lastName
//        this.age = age
//    }


    override fun toString(): String {
        return "Person(name='$name', lastName='$lastName', age=$age)"
    }
}