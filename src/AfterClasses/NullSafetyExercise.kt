package AfterClasses

data class NullSafetyExercise (val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> NullSafetyExercise("Mary", 20)
    2 -> null
    3 -> NullSafetyExercise("John", 21)
    4 -> NullSafetyExercise("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
    println((1..5).sumOf { id -> salaryById(id) })
}