package basic.strings_e_arrays.solutions

fun main(){
    print("Digite uma frase: ")
    val frase: String = readln()

    val  kotlinReplaced:String = frase.replace("Kotlin", "Java")

    println(kotlinReplaced)
}