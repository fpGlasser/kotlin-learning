package basic.conditionals_e_loops.solutions

fun main(){
    var numero:Int;
    var maiorNumeroInicial = -999999999;
    var maiorNumero:Int = maiorNumeroInicial;

    println("Digite 5 numeros")

    for(i: Int in 1..5) {
        print("$i: ")
        numero = readln().toInt();

        if(numero > maiorNumero){
            maiorNumero = numero;
        }
    }

    if(maiorNumero == maiorNumeroInicial){
        println("O conjunto digitados contêm menores valores possiveis no int")
    }else{
        println("O maior numero digitado é: $maiorNumero")
    }
}