package Lessons_3

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buff = 20
    val bonusCrystallineOre = buff * crystallineOre / 100
    val bonusIronOre = buff * ironOre / 100

    println(bonusCrystallineOre.toInt())
    println(bonusIronOre.toInt())
}