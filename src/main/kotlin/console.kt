fun main() {
    print("Donnez votre nom : ")
    var name :String?= readLine()

    print("Donnez votre age : ")
    var age:Int= readLine()!!.toInt()

    println(" Votre nom est $name et vous avez $age ans")
}