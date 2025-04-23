package Lessons_5

fun main() {
    val cargoFirstWeight = 20
    val cargoSecondWeight = 50
    val cargoSecondVolume = 80
    val cargoThreeVolume = 100

    println((cargoFirstWeight > Weight_Min) == (cargoFirstWeight <= Weight_Max))
    println(((cargoSecondWeight > Weight_Min) == (cargoSecondWeight <= Weight_Max)) == (cargoSecondVolume < Volume_Value))
    println(cargoThreeVolume < Volume_Value)
}

const val Weight_Min = 35
const val Weight_Max = 100
const val Volume_Value = 100