package br.com.rayana.section07._0704

fun main() {
    val person = Person("Stan", "Lee")

    val kClass = person::class

  //  println("Simple name = $kClass")
    println("Simple name = ${kClass.simpleName}")

    //for(field in kClass.members) {
    for(field in kClass.java.declaredFields) {
        println("Property members = ${field.name}")
    }

    for(constructor in kClass.constructors) {
        println("Contructor = $constructor")
        println("Contructor Return = ${constructor.returnType}")
        println("Contructor Parameters = ${constructor.parameters}")
    }
}