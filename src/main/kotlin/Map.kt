fun main(){
    //immutable
    var im_map = mapOf<String,Int>("Ahmed" to 22,"Mariem" to 38 )
    println("First element of map =" + im_map["Ahmed"])
    println("Second element of map = " + im_map["Mariem"])
    //im_map.put("Ali",30) //read only map
    //mutable

    var mu_map = mutableMapOf<String,Int>("Ahmed" to 22,"Mariem" to 38 )
    println("First element of map =" + mu_map["Ahmed"])
    println("Second element of map = " + mu_map["Mariem"])
    mu_map.put("Ali",30)
    println("l'age de Ali est : "+mu_map.get("Ali"))

}