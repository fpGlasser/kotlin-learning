package basic.functions.solutions

import kotlin.math.pow

fun main(){
    println("Digite um numero para calcular o seu quadrado")
    val numero:Double = readln().toDouble()

    val result: Double = squareOfNumber(numero)

    println("Quadrado do numero: $numero é $result")
}

fun squareOfNumber(num: Double): Double {
    return  num.pow(2.0)
}