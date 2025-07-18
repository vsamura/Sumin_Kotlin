package hello

fun main(){
    val typeOfVehicle = readln().toBoolean()
    val power = readln().toInt()
    var praise: Int
    var typeOfVehicleString = "легковой автомобиль"

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

    if (typeOfVehicle) {
        typeOfVehicleString = "грузовой автомобиль"
        if (power <= 100) {
            praise = 25
        } else if (power <= 150) {
            praise = 40
        } else if (power <= 200) {
            praise = 50
        } else if (power <= 250) {
            praise = 65
        } else {
            praise = 85
        }

    }


    println("Вид ТС: $typeOfVehicleString")
    println("Мощность двигателя: $power л.с.")
    println("Налоговая ставка: $praise руб./л.с.")
    println("Сумма налога: ${praise * power} руб.")
}



