package br.com.rayana.section5._0502

//class Person constructor(firstName: String, lastName: String) {}
class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String): this(firstName, lastName)
}