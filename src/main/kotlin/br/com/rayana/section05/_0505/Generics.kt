package br.com.rayana.section05._0505

fun main() {
    val maxInt = max(42, 49)
    val maxLong = max(123_456_789L, 999_999_999L)
    val maxByte = max((-128).toByte(), (127).toByte())
    val maxString = max("Alpha", "Omega")

    println("The max Int = $maxInt")
    println("The max Long = $maxLong")
    println("The max Byte = $maxByte")
    println("The max String = $maxString")

}