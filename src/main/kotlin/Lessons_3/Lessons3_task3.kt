package Lessons_3

fun main() {
    val hourOfDeparture = 9
    val minutesByHours = 60
    val minuteOfDeparture = 39
    val minuteTransitTime = 457
    val hoursOfArrivalTime = minuteTransitTime / minutesByHours + hourOfDeparture
    val minuteOfArrivalTime = minuteTransitTime / minutesByHours - hoursOfArrivalTime + minuteOfDeparture

    print("$hoursOfArrivalTime:$minuteOfArrivalTime")
}