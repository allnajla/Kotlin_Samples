package abstractClass

import Heritage.Car

fun main() {
    //Cannot create instance of an abstract class
// var vehicle = Vehicle()

    var car = Car(2022)
    car.speed = 300

    println("Name: ${car.vehiculeName("Ferrari") } \n" +
            "Type: ${car.vehicleType("car")}\n"+
            "Model ${car.model} \n" +
            "Speed : ${car.speed}")
}