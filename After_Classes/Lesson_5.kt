fun main() {
    val myText: String = "My text."
    val mySymbol: Char = '&'
    println("My text: $myText \nMy symbol: $mySymbol")

    val myNumber: Int = 21345433
    val myLong: Long = 143563464989778

    println("Integer: $myNumber \nLong: $myLong")

//    val myNumber: Int = 21345433
//    val myLong: Long = myNumber.toLong()
//
//    println("Integer: $myNumber \nLong: $myLong")



//    val myLong: Long = 143563464989778
//    val myNumber: Int = myLong.toInt()
//
//    println("Integer: $myNumber \nLong: $myLong")

    val myFloat: Float = 2.35f
    val myDouble: Double = 6.21435465735324536 // Можемо конвертувати числа як і з Integer -> Long
    println("Float: $myFloat \nDouble: $myDouble")


    val myInt: Int = myDouble.toInt()
    println("Double to Int: $myInt")


    val x: Int = 2
    val y: Int = 3
    val isBigger: Boolean = x > y
    println("Boolean: $isBigger")

    val myNewText: String = isBigger.toString()
    println("Boolean to String: $myNewText")
}