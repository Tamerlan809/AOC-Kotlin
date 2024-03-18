package year2023.Day1

import java.io.File

//////////Year 2023, Day 1, Part A///////////

fun main(){
    val data : List<String> = File("src/main/kotlin/year2023/Day1/input2").readLines()
    println(data)

    val combinedNumbersA : MutableList<Int> = mutableListOf()
    data.forEach { a ->
        val numbers = a.filter { it.isDigit() }
        val firstDigit = numbers.first()
        val lastDigit = numbers.last()
        val combined = "$firstDigit$lastDigit"
        combinedNumbersA.add(combined.toInt())
    }

    println(combinedNumbersA)
    println("Right answer: 54561")
    println(combinedNumbersA.sum())
}