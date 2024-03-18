package year2023.Day1

import java.io.File

// Link: https://www.reddit.com/r/adventofcode/comments/1883ibu/comment/kblop2v/?utm_source=share&utm_medium=web3x&utm_name=web3xcss&utm_term=1&utm_content=share_button //

fun part1(): Int {
    return File("src", "day01/input.txt").readLines().sumOf {
        val trimmed = it.replace(Regex("[A-z]"), "")
        Integer.parseInt("${trimmed[0]}${trimmed[trimmed.length - 1]}")
    }
}

fun part2(): Int {
    val stringsToInts = mapOf(
        "zero"  to 0, "0" to 0,
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

    return File("src", "day01/input.txt").readLines().sumOf {
        val values = Regex("(?=(zero|one|two|three|four|five|six|seven|eight|nine|[0-9]))").findAll(it)
        Integer.parseInt("${stringsToInts[values.first().groupValues[1]]}${stringsToInts[values.last().groupValues[1]]}")
    }
}