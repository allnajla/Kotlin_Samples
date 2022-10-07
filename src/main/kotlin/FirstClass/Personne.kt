package FirstClass

class Personne ( var nom:String, var age:Int){
var email:String =""
    get() = field.uppercase()
    set(value) { field=value.uppercase()}
    constructor(nom:String,age:Int,email:String):this(nom,age){
        this.email=email
    }
    fun afficheinfo(){
        println("Nom : $nom")
        println("Age = $age")
    }

}