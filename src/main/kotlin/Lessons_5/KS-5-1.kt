package Lessons_5

fun main() {
    val countOfReservesToday = 13
    val contOfReservedTomorrow = 9
    val freeTablesToday: Boolean = countOfReservesToday < All_Tables
    println("Досупность столиков на сегодня - $freeTablesToday")
    val freeTablesTomorrow: Boolean = contOfReservedTomorrow < All_Tables
    println("Досупность столиков на завтра - $freeTablesTomorrow")
}

const val All_Tables = 13
