package Lessons_3

fun main() {
    val hourOfDeparture = 9
    val minutesByHour = 60
    val minuteOfDeparture = 39
    val minuteTransitTime = 457
    val hoursOfArrivalTime = minuteTransitTime / minutesByHour + hourOfDeparture
    val minuteOfArrivalTime = minuteTransitTime / minutesByHour - hoursOfArrivalTime + minuteOfDeparture

    print("$hoursOfArrivalTime:$minuteOfArrivalTime")
}