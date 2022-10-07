fun main() {

    var age = arrayOf(1, 2, 3)
    println("First element of Array =" + age[0])
    println("Second element of Array = " + age.get(1))
    println("Third element of Array =" + age[2])
    println("----------------------------------------")

    var cars = arrayOf("Mercedes","BMW","Volkswagen")
    println("First element of Array =" + cars[0])
    println("Second element of Array = " + cars.get(1))
    println("Third element of Array =" + cars[2])
    println("----------------------------------------")

    cars.set(1,"FORD")
    println("First element of Array =" + cars[0])
    println("Second element of Array = " + cars.get(1))
    println("Third element of Array =" + cars[2])

    var carsandage = arrayOf("Mercedes",1,"BMW",4,"Volkswagen")
    println("First element of Array =" + carsandage[0])
    println("Second element of Array = " + carsandage.get(1))
    println("Third element of Array =" + carsandage[2])
    println("Fourth element of Array =" + carsandage[3])
    println("----------------------------------------")
    //problem
    carsandage.set(5,100)


}