package br.com.rayana.section08._0803

data class Student(val name: String, val age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ada", 19),
        Student("Manuel", 23),
        Student("Maria", 20),
        Student("João", 39),
        Student("José", 16)
    )
}
