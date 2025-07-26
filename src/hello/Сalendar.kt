package hello

fun main() {
    val months = listOf(
        "Январь",
        "Февраль",
        "Март",
        "Апрель",
        "Май",
        "Июнь",
        "Июль",
        "Август",
        "Сентябрь",
        "Октябрь",
        "Ноябрь",
        "Декабрь"
    )
    val whatMont = readln().toInt()
    if (whatMont > 12 || whatMont < 0) {
        println("Некорректное значение: $whatMont")
    } else {
        println(months[whatMont - 1])
    }
}