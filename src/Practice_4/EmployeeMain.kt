package Practice_4


fun main() {
//    val employeeList = mutableListOf<Employee>()
//    employeeList.add(Employee("Maksym", "Pashchenko", "Student"))
//    employeeList.add(Employee("Andrii", "Krenevych", "Teacher"))
//    employeeList.add(Employee("Maksym", "Pashchenko", "Student"))
//
//    for (employee in employeeList) {
//        println(employee)
//    }
//
//    println(employeeList[0] == employeeList[1])
//    println(employeeList[0] === employeeList[1])
//
//    println(employeeList[1] == employeeList[2])
//    println(employeeList[1] === employeeList[2])
//
//    println(employeeList[0] == employeeList[2])
//    println(employeeList[0] === employeeList[2])

    val emp1 = Employee("Maksym", "Pashchenko", "Student")
    val emp2 = Employee("Andrii", "Krenevych", "Teacher")

    val (name, surname, job) = emp1
    println("$name $surname $job")

    val emp3 = emp1.copy()

    println(emp1)
    println(emp2)
    println(emp3)

    println(emp1 == emp3)
    println(emp1 === emp3)

    println(emp1 == emp2)
    println(emp1 === emp2)

    println(emp2 == emp3)
    println(emp2 === emp3)

    println(emp1.toString())
    println(emp2.toString())
    println(emp3.toString())

    println(emp1.hashCode())
    println(emp2.hashCode())
    println(emp3.hashCode())
}