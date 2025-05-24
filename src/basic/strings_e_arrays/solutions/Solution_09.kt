package basic.strings_e_arrays.solutions

fun main() {
    var nome: String=""
    val listaNomes: MutableList<String> = mutableListOf()

    print("Digite nomes, para sair digite 'sair': ")

    do{
        nome = readln()
        if(nome != "sair"){
            listaNomes.add(nome)
        }
    }while(nome != "sair")

    println("Nomes digitados são:")
    listaNomes.forEach(::println)
}