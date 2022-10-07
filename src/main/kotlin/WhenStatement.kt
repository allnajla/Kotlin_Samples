fun main() {
    var numJour:Int? = if(readLine()!! in "1".."7") readLine()?.toInt() else -1
    var jour:String

    when(numJour){
        1-> jour ="Lundi"
        2-> jour ="Mardi"
        3-> jour ="Mercredi"
        4-> jour ="Jeudi"
        5-> jour ="Vendredi"
        6-> jour ="Samedi"
        7-> jour ="Dimanche"
        else -> jour = "invalide"
    }
    println("Le jour est $jour")
}