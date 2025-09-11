package AfterClasses

fun main() {
    val user = User("Maksym", 1)

    println(user)

    val user1 = User("Alex", 2)
    val user2 = User("Alex", 2)
    val user3 = User("Max", 3)

    println("user1 == user2: ${user1 == user2}")
    println("user2 == user3: ${user2 == user3}")

    println(user.copy())
    println(user.copy(name = "Masha"))
    println(user.copy(id = 4))

}