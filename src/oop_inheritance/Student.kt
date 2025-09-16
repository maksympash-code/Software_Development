package oop_inheritance

class Student(
    name: String = "",
    lastName: String = "",
    age: Int = 0,
    var specialty: String,
    var year: Int,
    ): Person(name, lastName, age), // наслідується від Person
//    CustomClass, // множинне наслідування у Kotlin забороняється
        MyInterface // реалізує інтерфейс MyInterface
{

    override fun showInfo(){
        super.showInfo()
//        println("Name: $name, LastName: $lastName, Age: $age")
        println("Specialty: $specialty, Year: $year")
    }

    override fun showFullInfo(){
        showInfo()
    }

    override fun foo(){
        println("Foo from Student")
    }

    override fun bar(){
        println("Bar from Student")
    }
}