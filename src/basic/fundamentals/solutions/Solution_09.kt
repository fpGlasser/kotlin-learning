package basic.fundamentals.solutions

fun main(){
    print("Digite um numero: ");
    val numero = readln().toInt()
    if(numero % 2 == 0) {
        println("O numero digitado é par")
    }else{
        println("O numero digitado é impar")
    }
}