enum class Bit {
    ZERO, ONE
}

    fun main(){

        //types with Kotlin
        // Byte Char Boolean Short Long Float...
        var nom : String
        //declare variable
        var age : Int
        //declare & instantiate variable
        var moyenne = 10.0 //taken as Double directly

        //declare constant
        val taille = 30

        //Les entiers
        val a1: Byte = 1 //1oc
        val b1:Short = 10//2oc
        val c1: Int =200// 4oc
        val c: Long = 1000000000 //8oc

        //Les réels
        val e:Float =2000.2F//4oc
        val f:Double = 2000000000.456// 8oc

        println("max Byte " + Byte.MAX_VALUE)


        val lettre : Char ='C'
        val Lettre_intostring : String ="C"
        println(lettre)
        val phrase : String ="Salut DSI3"
        println(phrase)

        //conversions
        val x:Int = 10
       // val y:Long = x //en java ça marche (conversion implicite)
        val z:Long = x.toLong() //pour kotlin il faut faire la conversion explicitement

        /*val num1 = 200.4F
        val num2 = num1.toInt()
        println("num2: "+num2)*/

        val num1 =65
        val mychar = num1.toChar()



        // print message
        println("hello word")



        //operators
        // + - * / %   += -= *= /= %=    ++ --
        val a = 10
        val b = 12

        var result = a + b

        println(" a + b = " +result)
        println("$a + $b = $result")

        //conditions
        var max = a
        if (a < b) max = b

        // With else
        if (a > b) {
            max = a
        } else {
            max = b
        }

        // As expression
        max = if (a > b) a else b
        println(max)


        //when expression
        when (max) {
            1 -> print("max == 1")
            2 -> print("max == 2")
            else -> {
                print("max is neither 1 nor 2")
            }
        }




    }

