package year2020.day1

import java.io.File

fun main() {
    day1()
}

fun day1(input: List<String> = File("src/main/kotlin/year2020/day1/input").readLines()) {
    val ints = input.map { Integer.valueOf(it) }

    val solution1 = pairs(ints)
        .filter { (a, b) -> a + b == 2020 }
        .map { (a, b) -> a * b }
        .first()

    println("Solution 1: $solution1")

    val solution2 = triples(ints)
        .filter { (a, b, c) -> a + b + c == 2020 }
        .map { (a, b, c) -> a * b * c }
        .first()

    println("Solution 2: $solution2")
}

fun <T> pairs(list: List<T>): Sequence<Pair<T, T>> = sequence {
    for (i in 0 until list.size - 1)
        for (j in i + 1 until list.size)
            yield(list[i] to list[j])
}

fun <T> triples(list: List<T>): Sequence<Triple<T, T, T>> = sequence {
    for (i in 0 until list.size - 2)
        for (j in i + 1 until list.size - 1)
            for (k in j + 1 until list.size)
                yield(Triple(list[i], list[j], list[k]))
}