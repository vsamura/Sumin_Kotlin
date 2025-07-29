package hello

fun main() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val newRange = firstNumber..secondNumber step 8
    for (number in newRange){
        println(number)
    }
}