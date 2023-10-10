package br.com.rayana.section5._0504

interface Vehicle {

    val automakerName: String

    fun start() {
        println("Vrummm...")
    }

    fun stop() {
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int
}