package basic.functions.solutions

fun main(){
    println("Digite 3 notas: ")
    var nota1:Double = readln().toDouble()
    var nota2:Double = readln().toDouble()
    var nota3:Double = readln().toDouble()

    val con:String = concept(nota1, nota2, nota3)
    println("conceito das notas $nota1, $nota2 e $nota3 é:  $con")
}

fun concept(nota1: Double, nota2: Double, nota3: Double): String {
    val avg:Double = average(listOf(nota1, nota2, nota3))

    if(avg >= 8){
        return "A"
    }else if(avg < 8 && avg >= 6){
        return "B"
    }else if(avg < 6 && avg >= 4){
        return "C"
    }else{
        return "D"
    }
}