package hello

fun main() {
    val numbers = readln().split(" ")
    var result = 0
    for (number in numbers){
        result+= number.toInt()
    }
    println(result)
}