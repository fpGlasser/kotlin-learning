package basic.conditionals_e_loops.solutions

fun main(){
    var soma: Int = 0

    for(i in 1..100){
        soma += i
    }
    println("A soma total dos números de 1 a 100 é igual a: $soma")
}