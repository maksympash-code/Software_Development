package HW_2

fun main() {
    var pizzaSlices = 0
    var pizzaSlicesEaten = 0
    // Start refactoring here

    while (pizzaSlices < 8) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    println()

    do{
        println("There's only $pizzaSlicesEaten slice/s of pizza :(")
        pizzaSlicesEaten++
    } while (pizzaSlicesEaten < pizzaSlices)

    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}