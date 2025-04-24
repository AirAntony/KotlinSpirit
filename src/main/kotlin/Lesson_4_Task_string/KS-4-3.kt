package Lesson_4_Task_string

fun main() {

    var number: Int = 5

    println(
        """${println("$number*2 = ${number * 2}")}
        | ${println("$number*3 = ${number * 3}")}
        | ${println("$number*4 = ${number * 4}")}
        | ${println("$number*5 = ${number * 5}")}
        | ${println("$number*6 = ${number * 6}")}
        | ${println("$number*7 = ${number * 7}")}
        | ${println("$number*8 = ${number * 8}")}
        | ${println("$number*9 = ${number * 9}")}
    """.trimMargin()
    )
}