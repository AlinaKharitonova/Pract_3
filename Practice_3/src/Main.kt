
fun main() {
    //1
    val myAge = 18
    val isTeenager = if (13 < myAge && myAge < 19) {
        println("$myAge находится в диапазоне от 13 до 19") }
    else {
        println("$myAge не находится в диапазоне от 13 до 19")
    }
    //val isTeenager = if (myAge in 13..19) ...
    // in - используется для проверки, находится ли заданное значение в
    //пределах определенного диапазона или коллекции.

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
}