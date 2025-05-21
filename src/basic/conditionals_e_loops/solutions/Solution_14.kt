package basic.conditionals_e_loops.solutions

fun main(){
    var contador: Int = 0;
    val intervalo: Int = 10;

    while(contador < 100){
        println(contador)
        contador+=intervalo;
    }

    println(contador)
}