package ru.albertlysenco.kotlinlearn

fun main(args: Array<String>) {
    val playerName: String = "Estragon"
    var experiencePoints: Int = 5
    var healthPoints: Int = 5
    experiencePoints += 5
    var hasSteed = false
    var isBlessed = false
    var isImmortal = false
    val tavernName = "Рог единорога"
    val tavernMasterFirstQuestion = "Вам нужна конюшня?"
    val tavernMasterSecondQuestion = "Замечательно!"
    val estragonAnswer = "Нет, - отвечает $playerName, - у меня нет скакуна. Но у меня есть пятьдесят монет, и я хочу выпить"

    if(healthPoints == 100) {
        println("$playerName is in excellent condition!")
    } else {
        println("$playerName is in awful condition!")
    }

    val race = "gnome"
    val faction = when(race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> ""
    }

    val healthStatus = when(healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches"
        in 75..89 -> if(isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds"
        }
        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition!"
    }

    println(faction)
    println(healthStatus)


    println(experiencePoints)
    println(playerName)
    println(playerName.reversed())
}