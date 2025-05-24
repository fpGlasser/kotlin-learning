package basic.strings_e_arrays.solutions

fun main(){
    print("Digite uma frase: ")
    var frase: String = readln()

    val palavrasQtd: Int = frase.split(" ").size
    println("Frase digitada contém  $palavrasQtd palavras")
}