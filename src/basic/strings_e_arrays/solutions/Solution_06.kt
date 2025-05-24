package basic.strings_e_arrays.solutions

fun main(){
    var stringInvertida: String = ""

    print("Digite uma string: ")
    val frase: String = readln()

    for(i in frase.length - 1 downTo 0){
        stringInvertida += frase[i]
    }

    println("frase invertida é $stringInvertida")

}