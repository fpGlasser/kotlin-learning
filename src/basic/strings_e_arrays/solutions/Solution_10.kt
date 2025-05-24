package basic.strings_e_arrays.solutions

fun main(){
    val result: Map<String, Double> = mediaMaiorMenor(listOf(1.0, 2.2, 3.5, 4.1, 5.9, 6.8))
    println(result)
}

fun mediaMaiorMenor(listaNumeros: List<Double>): Map<String, Double>{
    val  average = listaNumeros.average()
    val max = listaNumeros.max()
    val min = listaNumeros.min()

    return mapOf("average" to average, "max" to max, "min" to min)
}