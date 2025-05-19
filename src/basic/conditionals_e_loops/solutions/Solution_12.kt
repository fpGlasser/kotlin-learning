package basic.conditionals_e_loops.solutions

fun main(){
    var contador = 0;

    for(i: Int in 1 ..50){
        if(i % 2 == 0){
            contador++
        }
    }

    println("Entre 1 e 50 existem $contador numeros pares");
}