package br.com.rayana.section08._0810

import org.funktionale.memoization.memoize

fun main() {
    var fibonacci: (Long) -> Long = {it}
    fibonacci = {n: Long ->
        if(n < 2) n else fibonacci(n-1) + fibonacci(n-2)
    }

    var memory: (Long) -> Long = {it}
    memory = {n: Long ->
        if(n < 2) n else memory(n-1) + memory(n-2)
    }.memoize()

    println("Calling fibonacci: ${timeElapsed { fibonacci (40) }} ms")
    println("Calling memoized fibonacci: ${timeElapsed { memory (40) }} ms")
}

fun timeElapsed(body:() -> Unit): Long {
    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return end - start
}