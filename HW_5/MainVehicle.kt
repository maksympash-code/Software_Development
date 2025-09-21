package Practice_5

val vehicle: Vehicle? = Vehicle().apply {
        mark = "Honda"
        model = "Civic"
        year = 2020
        license_plate = "КА3344ВІ"
    }.also { println(it) }

fun createVenicle(year: Int, license_plate: String) =
    Vehicle(
        mark = "Honda",
        model = "Civic",
        year = year,
        license_plate = license_plate
    )

fun main() {
    vehicle?.let {
        println("Марка = ${it.mark}")
        println("Модель = ${it.model}")
        println("Рік випуску = ${it.year}")
        println("Номерний знак = ${it.license_plate}")
    }
}