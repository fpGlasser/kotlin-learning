package basic.strings_e_arrays.solutions

fun main(){
    val listaNomes: MutableList<String> = mutableListOf();
    var nome: String;
    print("Digite 5 nomes: ")

    for(i in 0..4){
        nome = readln()
        listaNomes.add(nome)
    }

    listaNomes.forEach(::println)
}