package br.com.rayana.section04._0410

fun fizzBuzz1(n: Int): List<String> {
    val list = mutableListOf<String>()

    for(it in 1 .. n) {
//        if(it % 3 == 0 && it % 5 == 0) {
//            list.add("FizzBuzz")
//        } else if(it % 3 == 0) {
//            list.add("Fizz")
//        } else if(it % 5 == 0) {
//            list.add("Buzz")
//        } else {
//            list.add(it.toString())
//        }

        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }

    return list
}

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()

    (1 .. n).forEach() {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        list.add(item)
    }

    return list
}