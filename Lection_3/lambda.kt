package functions

fun main() {
    val upperCaseString = {text: String -> // lambda function
        println(text)
        println(text.length)
        println("Hello, from uppercase")

        text.uppercase() // return isn`t needed
    }

    val otherNameOfUpperCaseString = upperCaseString

    val resFromUpperCaseFunction = otherNameOfUpperCaseString("hello")

    println("result from otherNameOfUpperCaseString: $resFromUpperCaseFunction")
}