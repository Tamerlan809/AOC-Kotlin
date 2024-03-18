package year2023.Day1

import java.io.File

class replacableNumbers(val word : String, val digit : String)

val replacableNumbersMap = mapOf(
    1 to replacableNumbers("one", "o1e"),
    2 to replacableNumbers("two", "t2o"),
    3 to replacableNumbers("three", "t3e"),
    4 to replacableNumbers("four", "f4r"),
    5 to replacableNumbers("five", "f5e"),
    6 to replacableNumbers("six", "s6x"),
    7 to replacableNumbers("seven", "s7n"),
    8 to replacableNumbers("eight", "e8t"),
    9 to replacableNumbers("nine", "n9e")
)


fun main(){
    val data : List<String> = File("src/main/kotlin/year2023/Day1/input2").readLines()
    println(data)
    val newData = data.map { a ->
        var newDataa = a
        replacableNumbersMap.values.forEach { b ->
            newDataa = newDataa.replace(b.word, b.digit)
        }
        newDataa
    }

    println(newData)

    val combinedNumbersB : MutableList<Int> = mutableListOf()
    newData.forEach { a ->
        val numbers = a.filter { it.isDigit() }
        val firstDigit = numbers.first()
        val lastDigit = numbers.last()
        val combined = "$firstDigit$lastDigit"
        combinedNumbersB.add(combined.toInt())
    }

    println(combinedNumbersB)

    println("right answer is: 54076")
    println(combinedNumbersB.sum())
}