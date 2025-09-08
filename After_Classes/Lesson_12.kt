
fun main() {
    beep()
    climateControl()
}


fun beep(){
    println("Beep!")
}

fun getTemp(): Int{
    val currentTemp = 30
    return currentTemp
}

fun cooldown(x: Int = 3){
    println("Cooling down $x")
}

fun heat(x: Int = 3){
    println("Heating up $x")
}


fun climateControl(){
    val preferTemp = 20
    val temp = getTemp()
    println("Temperature now: $temp")

    val diffTemp = temp - preferTemp
    val correctDiff = Math.abs(diffTemp)
    if (preferTemp < temp)
        cooldown(correctDiff)
    else
        heat(correctDiff)
}


