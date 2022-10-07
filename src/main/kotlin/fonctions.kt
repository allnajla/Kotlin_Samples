fun main() {
print("Entrer le premier nombre ")
    var n1:Int= readLine()!!.toInt()
    print("Entrer le deuxième nombre ")
    var n2:Int= readLine()!!.toInt()
    show(n1,n2)
    println("La somme des deux nombres est : "+add(n1,n2))
    println("Le minimum est : "+findMinNumber(n1,n2))
}
fun show(num1:Int,num2:Int){
    println("Vos entiers sont $num1 et $num2 ")
}
fun add (num1:Int,num2:Int) : Int{
    var sum:Int = 0
    sum = num1+num2
    return sum
}
fun findMinNumber(num1:Int,num2:Int): Int{
    var min :Int
    if(num1<num2)
        min=num1
    else
        min=num2
    return min
}