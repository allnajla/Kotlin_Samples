package FirstClass

fun main(){
    val p1 = Personne("Sirine",12)
    p1.afficheinfo()

    val p2 = Personne("Nesrine",12,"Nesrine@gmail.com")
    p2.afficheinfo()
    println(p2.email)
}