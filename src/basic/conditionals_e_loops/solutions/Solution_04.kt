package basic.conditionals_e_loops.solutions

fun main(){
    print("Digite um número referente ao dia da semana: ")
    val dia = readln().toInt()

    when(dia){
        1-> println("Domingo");
        2-> println("Segunda-feira");
        3-> println("Terça-feira");
        4-> println("Quarta-feira");
        5-> println("Quinta-feira");
        6-> println("Sexta-feira");
        7-> println("Sábado");
        else -> println("O numero digitando não é válido")
    }
}