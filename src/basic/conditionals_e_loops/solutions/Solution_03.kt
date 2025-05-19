package basic.conditionals_e_loops.solutions

fun main(){
    print("Digite um numero inteiro: ")
    val numero: Int = readln().toInt();

    if(numero % 3 == 0  && numero % 5 == 0){
        println("O número $numero é múltiplo de 3 e de 5")
    }else{
        println("O número $numero não é múltiplo de 3 e de 5")
    }
}