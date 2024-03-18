package year2021.day2

import java.io.File

fun main() {
    val data = File("src/main/kotlin/year2021/day2/input")
        .readLines()
    println(data)
    println("empty")

    var horizontal = 0
    var depth = 0

    data.forEach { d ->
        val separatedData = d.split(' ')
        val order = separatedData[0]
        val steps = separatedData[1].toInt()

        when(order){
            "forward" -> horizontal += steps
            "up" -> depth -= steps
            "down" -> depth += steps
        }
    }
    println(horizontal)
    println(depth)
    println(horizontal * depth)
}