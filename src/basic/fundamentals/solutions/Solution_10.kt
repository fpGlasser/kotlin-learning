package basic.fundamentals.solutions

fun main(){
    println("Digite dois (2) numeros: ")
    val num1:Int = readln().toInt()
    val num2:Int = readln().toInt()

    if(num1 == num2){
        println("Os dois numeros digitados são iguais")
    }else if(num1 > num2){
        println("O primeiro numero é maior que o segundo numero")
    }else{
        println("O segundo numero é maior que o primeiro numero")
    }
}