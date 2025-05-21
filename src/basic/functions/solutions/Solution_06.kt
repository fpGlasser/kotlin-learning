package basic.functions.solutions

fun main(){
    println("Digite um conjuntos de notas para calcular média, para parar digite nota negativa")
    var nota: Double = 0.0;
    var listaNotas: MutableList<Double> = mutableListOf();


    while(nota>=0){
        nota = readln().toDouble()
        if (nota >=0 ) {
            listaNotas.add(nota)
        }
    }

    val  avg: Double = average(listaNotas)
    println("Lista de notas: $listaNotas")
    println("As medias das notas: $avg ")
}

fun average(listaNotas: List<Double>): Double{
    if(listaNotas.isEmpty()){
        return 0.0;
    }
    return listaNotas.average()
}