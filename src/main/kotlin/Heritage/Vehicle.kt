package Heritage

open class Vehicle {
// must be open because a class in kotlin is final by default

    var type:String? = null
    var model:String? =null
    var maxspeed:String?=null
    fun show(){
        println("Type : $type")
        println("Model : $model")
        println("Max Speed : $maxspeed")
    }
}