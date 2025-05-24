package basic.strings_e_arrays.solutions

fun main(){
    var numero: Int;
    var listaNumeros: MutableList<Int> = mutableListOf()

    println("Digite 10 numeros")
    for (i in 1..10) {
        numero = readln().toInt()
        listaNumeros.add(numero)
    }

    println("Os numero pares digitados são:")
    listaNumeros.forEach{it -> if (it % 2 == 0) {
        println(it)
    }
    }
}