package basic.fundamentals.solutions

fun main(){
    print("Digite um numero: ")
    val n = readln().toInt()
    if(n == 0 ){
        print("O numero digitado é zero")
    }else if(n % 2 == 0){
        print("O numero digitado é par")
    }else  {
        print("O numero digitado é impar")
    }
}