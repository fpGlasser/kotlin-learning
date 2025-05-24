package basic.strings_e_arrays.solutions

//Transforme uma frase em uma lista de palavras e imprima cada uma em uma linha.

fun main(){
    print("Digite uma frase: ")
    val frase: String = readln()

    val  listaFrases: List<String> = frase.split(" ")

    listaFrases.forEach{println(it)}
}