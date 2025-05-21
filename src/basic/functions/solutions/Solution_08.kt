package basic.functions.solutions

fun main(){
    println("Digite dois numeros")
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()

    val maxNumber: Int = max(num1, num2)

    print("O maior numero entre $num1 e $num2 é $maxNumber")

}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}