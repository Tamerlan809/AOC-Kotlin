package year2023.Day1

import java.io.File
//Link: https://www.reddit.com/r/adventofcode/comments/1883ibu/comment/kblop2v/?utm_source=share&utm_medium=web3x&utm_name=web3xcss&utm_term=1&utm_content=share_button //
/*
Skillnaden mellan Före och efter i B delen:
I före delen så skapade jag en class för word and digit och sen skapade en map för replacable siffror
och sen gick jag genom input filen och letade efter word i mappen och sen ersättade dem med digit.
Efter det gjorde jag samma sak som jag gjorde i före delen i part A.
Men i efter delen slapp jag skapa class och skapade direkt en mapOf ord som jag letade efter och deras motsvarande digit.
Sen använda jag samma sumOf som jag gjorde i part A efter delen. Men här i funktionen så körde jag Regex för att hitta alla siffreord
och siffrorna mellan 1-9 och sen spara dem till values. Därefter tar man ut första och sista matchningen av siffrorna från values
och tar deras matchande siffra från mappen. Genom integerParseInt omvandlar man strängen till int.
 */

fun main() {
    val replacableNumbersAfter = mapOf(
        "one"   to 1, "1" to 1,
        "two"   to 2, "2" to 2,
        "three" to 3, "3" to 3,
        "four"  to 4, "4" to 4,
        "five"  to 5, "5" to 5,
        "six"   to 6, "6" to 6,
        "seven" to 7, "7" to 7,
        "eight" to 8, "8" to 8,
        "nine"  to 9, "9" to 9,
    )

    val data : List<String> = File("src/main/kotlin/year2023/Day1/input2").readLines()
    println(data)

    val combinedNumbersB = data.sumOf {
        val values = Regex("(?=(one|two|three|four|five|six|seven|eight|nine|[1-9]))").findAll(it)
        Integer.parseInt("${replacableNumbersAfter[values.first().groupValues[1]]}${replacableNumbersAfter[values.last().groupValues[1]]}" )}

    println("right answer is: 54076")
    println(combinedNumbersB)
}