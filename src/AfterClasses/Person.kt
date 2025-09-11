package AfterClasses

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
data class Name(val firstName: String, val lastName: String)
data class Address(val streetAddress: String, val city: City)
data class City(val name: String, val countryCode: String)