package Practice_4

class Employee(val name: String, val surname: String, val job: String) {
    fun copy(
        name: String = this.name,
        surname: String = this.surname,
        job: String = this.job
    ): Employee {
        return Employee(name, surname, job)
    }

    override fun toString(): String {
        return "Employee(name='$name', surname='$surname', job='$job')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Employee) return false
        return name == other.name &&
                surname == other.surname &&
                job == other.job
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + job.hashCode()
        return result
    }

    operator fun component1() = name
    operator fun component2() = surname
    operator fun component3() = job
}