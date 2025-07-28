package hello

fun main() {
    val brands = listOf(
        "Toyota", "Volkswagen", "Ford", "Honda", "Chevrolet",
        "BMW", "Mercedes-Benz", "Audi", "Nissan", "Hyundai",
        "Kia", "Volvo", "Subaru", "Mazda", "Lexus",
        "Tesla", "Porsche", "Jeep", "Fiat", "Renault",
        "Ferrari", "Lamborghini", "Bugatti", "Maserati", "Aston Martin",
        "Bentley", "Rolls-Royce", "McLaren", "Pagani", "Koenigsegg",
        "Geely", "BYD", "Chery", "Great Wall", "Changan",
        "NIO", "Xpeng", "Li Auto", "Hongqi", "SAIC",
        "Mitsubishi", "Suzuki", "Daihatsu", "Isuzu", "Infiniti",
        "Acura", "Datsun", "Hino", "Mitsuoka", "Scion",
        "Peugeot", "Citroën", "Opel", "Skoda", "Seat",
        "Alfa Romeo", "Lancia", "Dacia", "Saab", "Smart",
        "Cadillac", "GMC", "Dodge", "Chrysler", "Lincoln",
        "Buick", "Pontiac", "Oldsmobile", "Plymouth", "Saturn",
        "Genesis", "SsangYong", "Daewoo", "Proto", "Oullim",
        "Lada", "GAZ", "UAZ", "Moskvich", "Aurus",
        "DeLorean", "Maybach", "Hummer", "Tatra", "Wiesmann",
        "Vector", "Spyker", "Zenvo", "Rimac", "Bristol"
    )
    val search = readln()
    var res = false
    for (brand in brands){
        if (brand == search){
            res = true
            break
        }
    }
    println(res)
}