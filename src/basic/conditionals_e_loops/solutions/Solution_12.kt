package basic.conditionals_e_loops.solutions

fun main(){

    var contador: Int = 0;

    for(i: Int in 1..50){
        if(i % 2 == 0){
            contador++
        }
    }

    println("Existem $contador numeros pares entre 1 e 50")
}