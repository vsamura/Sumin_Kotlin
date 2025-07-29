package hello

fun main() {
    val cargoWeight = readln().toDouble()

    val cost = when {
        cargoWeight < 2.0 -> 150
        cargoWeight < 5.0 -> 200
        cargoWeight < 12.0 -> 250
        cargoWeight < 18.0 -> 300
        cargoWeight < 30.0 -> 350
        cargoWeight < 200.0 -> 1000
        else -> 0
    }

    if (cost == 0) {
        println("Для расчета стоимости свяжитесь с менеджером.")
    } else {
        println("$cost руб./км.")
    }
}