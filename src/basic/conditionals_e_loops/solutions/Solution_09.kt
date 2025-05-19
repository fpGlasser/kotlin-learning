package basic.conditionals_e_loops.solutions

import java.text.DecimalFormat

fun main() {
    print("Digite um numero para visualizar a sua tabuada: ")
    val numero = readln().toInt();


    println("Soma")
    for(i: Int in 1..9){
        println("$numero + $i = ${numero + i}")
    }
    println("Subtração")
    for(i: Int in 1..9){
        println("$numero - $i = ${numero - i}")
    }

    println("Muliplicação")
    for(i: Int in 1..9){
        println("$numero x $i = ${numero * i}")
    }
    println("Divisão")
    for(i: Int in 1..9){
        println("$numero ÷ $i = ${DecimalFormat("").format(numero / i)}")
    }


}