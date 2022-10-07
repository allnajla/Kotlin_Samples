fun main() {
    val text:String? = null
    val text2:String? = "hello"

    val taille:Int=text?.length?:-1
    val taille2:Int=text2?.length?:-1

    println("taille : $taille")
    println("taille2 : $taille2")
}