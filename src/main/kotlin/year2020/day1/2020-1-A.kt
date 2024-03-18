package year2020.day1

import java.io.File

fun main(){
    val numbersList = File("src/main/kotlin/year2020/day1/input")
        .readLines()
        .map { it.toInt() }

    for (firstEntry in numbersList){
        for (secondEntry in numbersList){
            if (firstEntry + secondEntry == 2020) {
                println("$firstEntry, $secondEntry"
                        + " answer to puzzle is = "
                        + firstEntry * secondEntry)
            }
        }
    }
}