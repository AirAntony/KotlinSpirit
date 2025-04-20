package Lessons_3

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val minuteTransitTime = 457
    val hourOfArrivalTime = minuteTransitTime / 60 + hourOfDeparture
    val minuteOfArrivalTime = minuteTransitTime / 60 - hourOfArrivalTime + minuteOfDeparture

    print("$hourOfArrivalTime:$minuteOfArrivalTime")

}