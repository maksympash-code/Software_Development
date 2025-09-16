package nullsafety


//class Team(
//    var person1: Person,
//    var person2: Person,
////    var person3: Person,
//)
//
//var team: Team? = null

fun main() {

    team = Team(
        person1 = Person("Mykola", "Ilchuk", 20),
        person2 = Person("Maksym", "Pashchenko", 19),
    )

    println(team?.person2?.name)
    println(team?.person2?.lastName)
    println(team?.person2?.age)

    team?.let {
        with(it.person2){
            println(it.person2.name)
            println(it.person2.lastName)
            println(it.person2.age)
        }
    }
}
