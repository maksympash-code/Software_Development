package nullsafety


//fun showSomething(something: String? = null){
//    if (something != null){
//        println(something)
//    }
//    else {
//        println("Something is null")
//    }
//}

//fun showSomething(something: String? = null){
//
////    something?.let { println(something) } ?: println("Something is null")
////    println(something) ?: println("Something is null")
//
//    something ?: return
//    println(something)
//}


fun showPersonInfo(person: Person?){
    person ?: return

    println("${person.name} ${person.lastName} ${person.age}")
}


fun main() {
//    showPersonInfo(Person("Mykola", "Ilchuk", 20))
    showPersonInfo(null)
}