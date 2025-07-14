package hello

fun main(){
    val power = readln().toInt()
    val praise: Int

    if (power <= 100) {
        praise = 10
    } else if (power <= 150) {
        praise = 34
    } else if (power <= 200) {
        praise = 49
    } else if (power <= 250) {
        praise = 75
    } else {
        praise = 150
    }

    println("Вид ТС: легковой автомобиль")
    println("Мощность двигателя: $power л.с.")
    println("Налоговая ставка: $praise руб./л.с.")
    println("Сумма налога: ${praise * power} руб.")
}



