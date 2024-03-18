package year2022InteLöst.Day1

import java.io.File

fun main() {
        val inputFilePath = "src/main/kotlin/year2022/Day1/input" // Update this with the actual path to your input file
        val listsOfNumbers = mutableListOf<List<Int>>()
        val currentList = mutableListOf<Int>()

        File(inputFilePath).forEachLine { line ->
            if (line.isBlank()) {
                if (currentList.isNotEmpty()) {
                    listsOfNumbers.add(currentList.toList())
                    currentList.clear()
                }
            } else {
                currentList.add(line.toInt())
            }
        }

        // Add the last list if it's not empty
        if (currentList.isNotEmpty()) {
            listsOfNumbers.add(currentList.toList())
        }

        // Print the lists of numbers
        listsOfNumbers.forEachIndexed { index, list ->
            println("List $index: $list")
        }
}