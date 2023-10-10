package br.com.rayana.section5._0503

fun main() {
    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    val location2 = object {
        var xCoordinate = 200
        var yCoordinate = 400
        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }

    location2.printIt()

    location2.xCoordinate = 3000
    location2.yCoordinate = 6000

    location2.printIt()

    val temperature = mySingleton.getLastTemperature()
    println("Last temperature measured = $temperature")
}

object mySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}