package br.com.rayana.section04._0405

fun main() {
    val myInt = 199
    val aInt = 7

   // int lowest = (myInt < aInt) ? myInt : aInt em java
    val lowest = if (myInt < aInt) myInt else aInt

    val temp = 26
    val isAirConditionerOn = if(temp >= 26) {
        println("It's warm")
        true
    } else {
        println("It's not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}