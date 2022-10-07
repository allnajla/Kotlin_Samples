fun main() {
    val text:String?="Hello"//? peut être affecté par une valeur null
    //println(text.length)// erreur puisque text peut être null
    println(text!!.length)//!!->le dev prend la responsabilité
    println(text?.length)// affiche la chaine null si le text est NULL
}
