package Lessons_3

fun main() {
    val crystallineOre = 7
    val ironOre = 11
    val buff = 1.2
    val bonusCrystallineOre = crystallineOre * buff - crystallineOre
    val bonusIronOre = ironOre * buff - ironOre



    println(bonusCrystallineOre.toInt())
    println(bonusIronOre.toInt())


}