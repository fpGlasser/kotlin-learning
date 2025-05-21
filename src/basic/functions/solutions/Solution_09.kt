package basic.functions.solutions

fun main(){
    println("Digite uma frase: ")
    val phrase: String =  readln()

    val vogalQtd: Int = countVogal(phrase)
    println("Esta frase contém $vogalQtd")

}

fun countVogal(phrase: String): Int {

    var count: Int = 0

    for (it in phrase.indices) {

        if(phrase[it] == 'A' || phrase[it] == 'a'){
            count++
        }
        else if(phrase[it] == 'E' || phrase[it] == 'e'){
            count++
        }else if(phrase[it] == 'I' || phrase[it] == 'i'){
            count++
        } else if(phrase[it] == 'O' || phrase[it] == 'o'){
            count++
        }else if(phrase[it] == 'U' || phrase[it] == 'u'){
            count++
        }else{
            count += 0
        }
    }

    return count
}