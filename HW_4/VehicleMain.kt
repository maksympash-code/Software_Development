package Practice_4

fun main() {
    val vehicle1 = Vehicle("BMW", "X5", 2021, "blue")
    val vehicle2 = Vehicle("Honda", "Civic", 2018, "red")
    val vehicle3 = Vehicle("BMW", "X5", 2021, "blue")

    println(vehicle1)
    println(vehicle2)
    println(vehicle3)

    println(vehicle1 == vehicle2)
    println(vehicle1 === vehicle2)

    println(vehicle2 == vehicle3)
    println(vehicle2 === vehicle3)

    println(vehicle1 == vehicle3)
    println(vehicle1 === vehicle3)

    val (mark, model, year, license_plate) = vehicle1
    println("$mark $model $year $license_plate")

    val copyVehicle = vehicle1.copy()

    println(vehicle1.toString())
    println(copyVehicle.toString())

    println(vehicle1.hashCode())
    println(copyVehicle.hashCode())

    println(vehicle1.equals(copyVehicle))
    println(copyVehicle.equals(vehicle1))

}