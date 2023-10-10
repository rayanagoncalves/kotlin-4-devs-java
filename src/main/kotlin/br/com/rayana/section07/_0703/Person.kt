package br.com.rayana.section07._0703

@Deprecated(message = "Use the Animal class instead", replaceWith = ReplaceWith("Animal"))
class Person internal constructor(var firstName: String, var lastName: String) {

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String): this(firstName, lastName)
}