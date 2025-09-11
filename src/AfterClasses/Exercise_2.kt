package AfterClasses

fun main() {
    val person = Person(
        Name("Jonh", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )

    println(person)
}