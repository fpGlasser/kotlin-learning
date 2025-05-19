package basic.fundamentals.solutions

fun main(){
    //declaração de variavel a  e b
    var a = 10;
    var b = 20;

    //troca de valores entre a e b
    var aux = a; // variavel auxiliar
    a = b;
    b = aux;

    // impressão dos resultados das trocas
    println("a = $a");
    println("b = $b");
}