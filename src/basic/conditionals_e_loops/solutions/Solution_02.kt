package basic.conditionals_e_loops.solutions

fun main(){
    print("Digite um numero inteiro: ")
    val numero: Int = readln().toInt();

    if(numero > 0  && numero < 100){
        println("O numero $numero esta entre 0 e 100")
    }else{
        println("O numero $numero não esta entre 0 e 100")
    }
}