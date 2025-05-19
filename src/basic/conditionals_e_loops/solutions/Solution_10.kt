package basic.conditionals_e_loops.solutions

fun main(){
    var palavra: String = "alaz"

    palavra = palavra.lowercase()

    var j: Int = 0
    var flag = 0
    for(i: Int in palavra.length -1 downTo  0){
        if(palavra[i] != palavra[j]){
            println("A palavra $palavra não é palindromo")
            flag = 1
            break;
        }
        j++
    }

    if(flag != 1){
        println("Palavra $palavra é palindromo")
    }
}