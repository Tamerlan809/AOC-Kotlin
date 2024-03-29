package year2023.Day1

import java.io.File
//Link: https://www.reddit.com/r/adventofcode/comments/1883ibu/comment/ke1yl9s/?utm_source=share&utm_medium=web3x&utm_name=web3xcss&utm_term=1&utm_content=share_button //
fun readInput(input: String): List<String> = File(input).readLines()

fun main() {
    fun part1(input: List<String>) = input.sumOf { line ->
        "${line.first { it.isDigit() }}${line.last { it.isDigit() }}".toInt() }


    val digitsMap = hashMapOf("one" to 1, "1" to 1,
        "2" to 2, "two" to 2,
        "3" to 3, "three" to 3,
        "4" to 4, "four" to 4,
        "5" to 5, "five" to 5,
        "6" to 6, "six" to 6,
        "7" to 7, "seven" to 7,
        "8" to 8, "eight" to 8,
        "9" to 9, "nine" to 9)

    fun part2(input: List<String>) = input.sumOf { line ->
        "${digitsMap[line.findAnyOf(digitsMap.keys)?.second]}${digitsMap[line.findLastAnyOf(digitsMap.keys)?.second]}".toInt() }

    // test if implementation meets criteria from the description, like:
    val testInput1 = readInput("src/main/kotlin/year2023/Day1/input")
    check(part1(testInput1) == 142)

    val testInput2 = readInput("src/main/kotlin/year2023/Day1/input")
    check(part2(testInput2) == 281)

    val input = readInput("src/main/kotlin/year2023/Day1/input2")
}