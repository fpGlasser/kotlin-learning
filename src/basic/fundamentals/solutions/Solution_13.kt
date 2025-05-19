package basic.fundamentals.solutions

import java.text.DecimalFormat

fun main(){
    print("Digite um numero decimal: ")
    val numeroDecimal: Double = readln().toDouble()

    println("O nummero aredondado é ${DecimalFormat("#.##").format(numeroDecimal)}")
}