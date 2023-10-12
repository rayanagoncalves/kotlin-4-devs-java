package br.com.erudio._0411.br.com.rayana.section08._0811

import br.com.rayana.section08._0812.findTheShortestStudentName
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class TestFindShortestStudentName {

    @Test
    fun `Find shortest student name should be equal 'Ada'`() {
        findTheShortestStudentName()?.name shouldBeEqualTo "Ada"
    }
}