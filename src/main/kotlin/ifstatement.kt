fun main() {
 print("Donnez un nombre : ")
 var number:Int= readLine()!!.toInt()
 if (number % 2 ==0)   {
     println("$number est pair")
 }else {
     println("$number est impair")
 }
}