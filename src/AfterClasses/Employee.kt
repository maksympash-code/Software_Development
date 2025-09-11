package AfterClasses

import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

data class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int){
    val names = listOf("John", "Bob", "Sally", "Tom", "Egor", "Oleksii", "Maksym")
    fun generateEmployee() =
        Employee(
            names.random(),
            Random.nextInt(minSalary, maxSalary))

}