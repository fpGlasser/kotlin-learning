package basic.functions.solutions

fun main(){

    print("Digite ano de nascimento para saber idade: ")
    val bornYear: Int = readln().toInt()

    val age: Int = calculateAge(bornYear)

    println("A pessoa tem $age anos de idade")

}

fun calculateAge(bornYear: Int): Int {
    val atualYear: Int = 2025
    return atualYear - bornYear;
}