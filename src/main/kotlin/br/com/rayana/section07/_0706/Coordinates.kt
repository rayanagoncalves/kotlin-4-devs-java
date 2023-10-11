package br.com.rayana.section07._0706

data class Coordinates(var x: Int, var y: Int) {

    operator fun plus(other: Coordinates) = Coordinates(x + other.x, y + other.y)

    operator fun minus(other: Coordinates) = Coordinates(x - other.x, y - other.y)
}
