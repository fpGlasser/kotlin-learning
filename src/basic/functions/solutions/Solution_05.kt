package basic.functions.solutions

import java.text.DecimalFormat
import kotlin.math.ceil

fun main(){
    print("Digite um numero: ")
    val number: Double = readln().toDouble()

    val result: Double = ceilRound(number)
    println("Numero $number arredondado para cima: $result")
}

fun ceilRound(num: Double): Double{
    return DecimalFormat("##.##").format(ceil(num)).toDouble()
}