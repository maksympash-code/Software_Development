package functions

fun printGreeting(greeting: String = "Anybody"){
    println("Hello, $greeting")
//    return "Hello" // Error
}

fun main() {
//    printGreeting("Andrii")
    printGreeting()
}