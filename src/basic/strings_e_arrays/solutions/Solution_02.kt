package basic.strings_e_arrays.solutions

fun main(){
    print("Digite uma frase: ")
    val frase: String = readln()

    val  listaFrases: List<String> = frase.split(" ")

    listaFrases.forEach{println(it)}
}