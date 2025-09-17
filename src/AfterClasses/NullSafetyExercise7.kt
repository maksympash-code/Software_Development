package AfterClasses

fun main() {
    var city: String? = "Kyiv"

    println(city!!.length)

    city = null
    println(city?.length)
}