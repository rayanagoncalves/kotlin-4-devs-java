package br.com.rayana.section07._0705

import br.com.rayana.section07._0702.Coordinates

fun main() {

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2
    println(c3)

   // val (xCoordinate, yCoordinate) = c3

 //   println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")
    println("xCoordinate = ${c3.component1()}, yCoordinate = ${c3.component2()}")
    showComponents()
}

fun showComponents() {
    val myPoint = Point(5000, 500, 6000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}