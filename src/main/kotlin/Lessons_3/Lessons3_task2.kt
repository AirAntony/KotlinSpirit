package Lessons_3

fun main() {
    val numberOfPermanentEmployee = 50
    val salaryOfPermanentEmployee = 30000
    val fotPermanentEmployee = numberOfPermanentEmployee * salaryOfPermanentEmployee
    val numberOfTrainee = 30
    val salaryOfTrainee = 20000
    val fotAllEmployee = numberOfTrainee * salaryOfTrainee + fotPermanentEmployee
    val averageFOT = fotAllEmployee / (numberOfTrainee + numberOfPermanentEmployee)

    println(fotPermanentEmployee)
    println(fotAllEmployee)
    println(averageFOT)
}
