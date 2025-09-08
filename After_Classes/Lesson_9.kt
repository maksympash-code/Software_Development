fun main() {
    val x: Int = 3
    val y: Int = 2
    val operation: String = "add" // Choose operation

    // if 'add' if not 'sub'
    val res: Int = when(operation){
        "add" -> {
            x + y
        }
        "sub" -> {
            x - y
        }
        else -> {
            x * y
        }
    }

    println("Result: $res")
    println("End")
}