package AfterClasses

class NullSafetyExercise6(val id: Int, val name: String?, val email: String?)


fun contactInfo(user: NullSafetyExercise6) = user.email ?: "No email"

fun main() {
    val user = NullSafetyExercise6(1, null, "maksympash@gmail.com")
    println(contactInfo(user))
}