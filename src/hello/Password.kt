package hello

fun main() {
    val password = readln().toCharArray()
    for (symbol in password){
        if (symbol == 'Ъ'){
            println("У вас идеальный пароль!")
            return
        }
    }
    println("Опс! В вашем пароле кое-чего не хватает.")
}