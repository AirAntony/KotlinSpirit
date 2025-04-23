package Lessons_3

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buff = 20
    val forPercent = 100
    val bonusCrystallineOre = buff * crystallineOre / forPercent
    val bonusIronOre = buff * ironOre / forPercent

    println(bonusCrystallineOre.toInt())
    println(bonusIronOre.toInt())
}