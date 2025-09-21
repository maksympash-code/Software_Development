package Practice_6

fun main() {
    var IllegalArgumentExceptionCounter = 0 // > 9
    var ArithmeticExceptionCounter = 0 // < 0
    var IndexOutOfBoundsExceptionCounter = 0 // 0 <= x <= 9

    while(true){
        print("Введіть число або 'досить': ")

        val input = readLine()!!
        if (input == "досить") break

        try{
            val x = input.toDouble()

            when{
                x < 0.0 -> throw ArithmeticException("x < 0")
                x > 9.0 -> throw IllegalArgumentException("x > 9")
                x in 0.0..9.0 -> throw IndexOutOfBoundsException("x == 0")
            }
        }
        catch (e: IllegalArgumentException){
            IllegalArgumentExceptionCounter++
            println(e.message)
        }
        catch (e: ArithmeticException){
            ArithmeticExceptionCounter++
            println(e.message)
        }
        catch (e: IndexOutOfBoundsException){
            IndexOutOfBoundsExceptionCounter++
        }
    }



    println(" IllegalArgumentExceptionCounter = $IllegalArgumentExceptionCounter")
    println(" ArithmeticExceptionCounter = $ArithmeticExceptionCounter")
    println(" IndexOutOfBoundsExceptionCounter = $IndexOutOfBoundsExceptionCounter")
}