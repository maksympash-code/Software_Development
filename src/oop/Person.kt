package oop

class Person(
    var name: String = "",
    var lastname: String = "",
    var age: Int = 0
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
        return "Person(name='$name', lastName='$lastname', age=$age)"
    }
}