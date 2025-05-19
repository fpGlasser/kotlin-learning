package basic.fundamentals.solutions

fun main(){
    print("Didite nome do usuario: ")
    val nome: String = readln();
    print("Digite idade do usuario: ")
    val idade: Int = readln().toInt()

    print("$nome tem $idade anos")
}