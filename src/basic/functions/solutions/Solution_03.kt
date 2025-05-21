package basic.functions.solutions

fun main(){
    println("Digite um numero para checar se é primo: ")
    val num:Int = readln().toInt()

    val isPrime:Boolean = isPrimeNumber(num)

    if(isPrime){
        println("O numero $num é primo")
    }else{
        println("O numero $num não é primo")
    }
}

fun isPrimeNumber(num: Int): Boolean {
    var isPrime = false;

    if(num >= 2){
        isPrime = true
        for(i in num-1 downTo 2){
            if(num % i == 0){
                isPrime = false
                break
            }
        }
    }else{
        isPrime = false
    }
    return isPrime
}