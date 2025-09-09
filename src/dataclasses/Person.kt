package dataclasses

data class Person(
    var name: String,
    var lastname: String,
    var age: Int
){

//    override fun toString(): String {
//        return "Person(name='$name', lastname='$lastname', age=$age)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Person
//
//        if (age != other.age) return false
//        if (name != other.name) return false
//        if (lastname != other.lastname) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = age
//        result = 31 * result + name.hashCode()
//        result = 31 * result + lastname.hashCode()
//        return result
//    }
}