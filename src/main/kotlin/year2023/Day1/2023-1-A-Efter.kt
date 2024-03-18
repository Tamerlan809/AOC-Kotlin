package year2023.Day1

import java.io.File
//Link: https://www.reddit.com/r/adventofcode/comments/1883ibu/comment/ke1yl9s/?utm_source=share&utm_medium=web3x&utm_name=web3xcss&utm_term=1&utm_content=share_button //
/*
Skillnaden mellan för och efter är att man i den före lösningen så tog man data och
gjorde forEach för allt och sen hittade första och den sista siffran. Sen gjorde man dem till en sträng och
därefter omvandlade man den till int. Efter det sparade man den combined siffra till en mutableList<Int>.
I slutet så räknade man summan av mutableList.
Efter lösningen så slipper man några steg t.ex. man behöver inte skapa en mutableList och
spara combined siffror där och räkna summan efter men man räknar summan av siffrorna medans man tar ut första och sista
siffran från data. Dessutom blir det mer prydligt kod.
 */

fun main() {
    val data: List<String> = File("src/main/kotlin/year2023/Day1/input2").readLines()
    println(data)

    val combinedNumbersA = data.sumOf { line ->
        "${line.first { it.isDigit() }}${line.last { it.isDigit() }}".toInt() }

    println("Right answer: 54561")
    println(combinedNumbersA)

}