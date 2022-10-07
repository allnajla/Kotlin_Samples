package abstractClass

abstract class Vehicle {
    abstract  fun vehiculeName(name:String):String

    fun vehicleType(type:String):String{
        return type
    }
    abstract var model:Int

    var speed:Int? =null
}