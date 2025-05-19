package basic.conditionals_e_loops.solutions

fun main(){
    println("Digite um numero para encontrar todos os seus divisores: ")
    val numero = readln().toInt()

    print("Divisores de $numero são: ")
    for( i: Int in numero downTo 1){
        if(numero % i == 0){
            print("$i ")
        }
    }
}