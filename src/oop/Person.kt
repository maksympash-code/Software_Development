package oop

class Person(
    name: String,
    lastname: String,
    age: Int
){

    var name: String = name
        get(){
            print("field name: ")
            return field // спеціальний об'єкт, що містить посилання на поточне поле
        }
        set(value){
            println("Change name field")
            if (value == ""){
                println("Name can't be change")
            } else{
            field = value
            }
        }

    var lastname = lastname
    var age = age

//    init{
//        id = idCounter++ // error
//    }
    var id: Int
        private set

    init {
        println("Init 1")
        println("Відпрацьовує первинний конструктор")

        id = idCounter++
    }

    constructor(): this("", "", 0){ // вторинний конструктор
        println("Constructor 1 without parameters")
    }

    constructor(name: String) : this(name, "", 0){
        println("Constructor 2 with one parameter")
    }


    override fun toString(): String {
        return "Person(name='$name', lastName='$lastname', age=$age, id=$id)"
    }

    init{
        println("Init 2 with id = $id")
    }

    companion object{ // static in Kotlin
        var idCounter = 0
    }
}