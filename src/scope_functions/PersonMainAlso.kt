package scope_functions

fun main() {

    val person = Person()
        .apply {
            this.name = "Egor"
            lastName = "Ignatenko"
            age = 20
            // return this apply повертає контекстний обʼєкт
        }.also {
            println(it)
            // return this
        }.also {per: Person ->
            println(per)
            // return this
        }

    println(person)
}