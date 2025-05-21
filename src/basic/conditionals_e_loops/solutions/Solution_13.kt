package basic.conditionals_e_loops.solutions

fun main(){
    print("Digite um numero para calcular fatorial: ")
    val numero: Int = readln().toInt()
    var fatorial: Int = 1

    for(i: Int in numero downTo 1){
        fatorial *= i;
    }

    println("Fatorial do numero $numero é: $fatorial")
}