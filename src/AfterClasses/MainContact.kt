package AfterClasses

fun main() {
    val contact = Contact(1, "maksympash@gmail.com")
    println(contact.email)

    contact.email = "jane@gmail.com"

    println(contact.email)

    contact.printId()

}