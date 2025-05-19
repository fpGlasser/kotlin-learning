package basic.conditionals_e_loops.solutions

fun main(){
    print("Digite nota do aluno: ");
    val nota: Double = readln().toDouble()

    if(nota >= 7.0){
        println("Aluno Aprovado")
    }else{
        println("Aluno Reprovado")
    }
}