package Lesson_4_Task_string

fun main() {
    val name = "Tatyana"
    val middleName = "Sergeevna"
    var lastName = "Andreeva"
    var age = 20

    println("$lastName $name $middleName, $age")

    age = 22
    lastName = "Sidorova"

    println("$lastName $name $middleName, $age")
}