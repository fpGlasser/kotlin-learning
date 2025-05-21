package basic.functions.solutions

fun main(){
    println("Digite dois numeros para saber a soma entre eles")
    print("Primeiro numero: ")
    val num1 = readln().toInt()

    print("Segundo numero")
    val num2 = readln().toInt()

    val resultSum: Int = sumNumbers(num1, num2)

    println("$num1 + $num2 = $resultSum")
}

fun sumNumbers(num1: Int, num2: Int): Int {
    return  num1 + num2
}