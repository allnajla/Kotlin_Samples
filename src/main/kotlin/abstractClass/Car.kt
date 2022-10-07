package abstractClass

class Car(override var model: Int) : Vehicle() {
    override fun vehiculeName(name: String): String {
       return name
    }
}