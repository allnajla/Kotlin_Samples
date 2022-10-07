fun main() {
    var somme:Int =0
    for (x in 0..10){
        println(x)
        somme+=x
    }

    println("la somme des nombres est $somme")

    var myList = arrayListOf<Any>("kotlin",2,2,10,'N',false,"kotlin")
/*for (y in myList.indices)
    println("myList[$y] = " +myList[y])*/
    myList.forEach{println(it)}
}