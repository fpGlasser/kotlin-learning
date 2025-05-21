package basic.functions.solutions

fun main(){
    print("Digite seu nome: ")
    val name: String = readln()
    val greetingMessage: String = greeting(name)

    println(greetingMessage)
}

fun greeting(name: String): String{
    return "Hello $name"
}