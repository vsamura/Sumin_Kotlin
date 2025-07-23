package hello

fun main() {
    print("Введите первое число: ")
    val firstNumber = readln().toDouble()
    print("Введите второе число: ")
    val secondNumber = readln().toDouble()
    print("Введите оператор: ")
    val operator = readln()
    val result: String
    if (operator == "+") {
        result = (firstNumber + secondNumber).toString()
    } else if (operator == "-") {
        result = (firstNumber - secondNumber).toString()
    } else if (operator == "*") {
        result = (firstNumber * secondNumber).toString()
    } else if (operator == "/") {
        result = (firstNumber / secondNumber).toString()
    } else {
        result = "Введен некоректный оператор!"
    }
    println(result)
}

