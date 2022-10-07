package interfaces

interface CanGo {
    fun go(){
        println("Vehicle can go")
    }
    val name: String // no getter and setters
}