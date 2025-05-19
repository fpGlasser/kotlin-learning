package basic.fundamentals.solutions

fun main(){
    print("Informe um numero: ");
    val numero: Double = readln().toDouble();

    println("O quadrado do numero informado pelo usuario é: ${Math.pow(numero, 2.0)}");
}