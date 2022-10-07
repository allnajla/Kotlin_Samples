import kotlin.random.Random

fun main() {
 /*   var i=5
    while(i>0){
        println(i)
        i--
    }*/

    //factoriel
   /* var k = 1
    var fact = 1
    while(k<6){
        fact *=k
        println("$k! = $fact")
        k++
    }*/

    // game
    val nombre_adeviner = Random.nextInt(0,100)
    println("Entrez un nombre")
    while (true){
        val nombre_propose = readln()!!.toInt()
        if(nombre_adeviner==nombre_propose){
            println("Bravo, vous avez deviné le nombre")
            break
        }else if (nombre_propose< nombre_adeviner)
            println("encore plus grand")
        else
            println("enore plus petit")
    }
}