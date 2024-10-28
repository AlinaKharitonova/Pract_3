import kotlin.math.*
import kotlin.Random.*
fun main() {
    //1
    val myAge = 18
    val isTeenager = if (13 < myAge && myAge < 19) {
        println("$myAge находится в диапазоне от 13 до 19") }
    else {
        println("$myAge не находится в диапазоне от 13 до 19")
    }
    //val isTeenager = myAge in 13..19

    //2
    val theirAge = 30
    val bothTeenagers = if (13 < myAge && myAge < 19 && 13 < theirAge && theirAge < 19)
        println("Оба человека являются подростками")
    else {
        println("Кто-то из них не является подростком или они оба не подростки")
    }

    //3
    val reader = "Alina"
    val author = "Richard Lucas"
    val authorIsReader = reader == author

    //4
    //val readerBeforeAuthor

    //5
    val myAge2 = 18
    if(myAge2 in 13..19) println("Подросток") else println("Не подросток")

    //6
    val answer: String
    if(myAge2 in 13..19) answer = "Подросток" else answer = "Не подросток"
    println(answer)

    //7
    var counter = 0
    while (counter < 10) {
        println(counter)
        counter +=1
    }

    //8
    var roll = 0
    do {
        roll = Random.nextInt(6)
        counter += 1
        println("После $counter бросков, roll равен $roll")
    } while (roll != 0)
}