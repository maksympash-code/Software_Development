package Practice_6

fun months(month: Int) = when(month){
    1 -> "January"
    2 -> "February"
    3 -> "March"
    4 -> "April"
    5 -> "May"
    6 -> "June"
    7 -> "July"
    8 -> "August"
    9 -> "September"
    10 -> "October"
    11 -> "November"
    12 -> "December"
    else -> null
}

fun season(month: String?) = when(month){
    in listOf("December", "January", "February") -> "Winter"
    in listOf("March", "April", "May") -> "Spring"
    in listOf("June", "July", "August") -> "Summer"
    in listOf("September", "October", "November") -> "Autumn"
    else -> null
}

fun main() {
    val month = 13

    val result = months(month)?.let { m ->
        season(m)?.let { s ->
            "$m - $s"
        } ?: throw IllegalArgumentException("Incorrect input")
    }

    println(result)
}