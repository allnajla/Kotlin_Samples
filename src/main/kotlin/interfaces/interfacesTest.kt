package interfaces

fun main() {
    var v = Vehicle()
    println("Name: ${v.name}")
    v.go()
    v.stop()
}