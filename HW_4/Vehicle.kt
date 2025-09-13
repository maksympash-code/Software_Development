package Practice_4

class Vehicle(val mark: String, val model: String, val year: Int, val license_plate: String) {
    fun copy(
        mark: String = this.mark,
        model: String = this.model,
        year: Int = this.year,
        license_plate: String = this.license_plate,
    ): Vehicle{
        return Vehicle(mark, model, year, license_plate)
    }


    override fun toString(): String {
        return "Vehicle(mark='$mark', model='$model', year=$year, license_plate='$license_plate')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        else if (other !is Vehicle) return false
        else{
            return mark == other.mark &&
                    model == other.model &&
                    year == other.year &&
                    license_plate == other.license_plate
        }
    }

    override fun hashCode(): Int {
        var result = mark.hashCode()
        result = 31 * result + model.hashCode()
        result = 31 * result + year
        result = 31 * result + license_plate.hashCode()
        return result
    }

    operator fun component1() = mark
    operator fun component2() = model
    operator fun component3() = year
    operator fun component4() = license_plate
}