package year2020.day1

import java.io.File

fun main(){
    val numbersList = File("src/main/kotlin/year2020/day1/input")
        .readLines()
        .map { it.toInt() }

    for (firstEntry in numbersList){
        for (secondEntry in numbersList){
            for (thirdEntry in numbersList){
                if (firstEntry + secondEntry + thirdEntry == 2020){
                    println("$firstEntry, $secondEntry, $thirdEntry"
                            + " answer to puzzle is = "
                            + firstEntry * secondEntry * thirdEntry)
                }
            }
        }
    }
}