package basic.conditionals_e_loops.solutions

fun main(){
    var numero: Int;
    var contadorPar: Int = 0;
    var contadorImpar: Int = 0

    for(i in 1 .. 10){
        numero = readln().toInt()
        if(numero % 2 == 0){
            contadorPar++
        }else{
            contadorImpar++
        }

    }

    println("Foram digitados $contadorPar numeros pares")
    println("Foram digitados $contadorImpar numeros impares")

}