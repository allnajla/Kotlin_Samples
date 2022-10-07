fun main(){
var intArrayList =ArrayList<Int>()
    intArrayList.add(10)
    intArrayList.add(1,21)
    intArrayList.add(20)
    println("First element of Array =" + intArrayList[0])
    println("Second element of Array = " + intArrayList.get(1))
    println("Third element of Array = ${intArrayList[2]}")

    intArrayList.remove(20)
    println(intArrayList.size)
    println("----------------------------------------")

    var mixArrayList = ArrayList<Any>()
    mixArrayList.add("Ford")
    mixArrayList.add(5)
    mixArrayList.add(2.5)
    mixArrayList.add(false)
    mixArrayList.add('$')
    println("First element of Array =" + mixArrayList[0])
    println("Second element of Array = " + mixArrayList.get(1))
    println("Third element of Array =" + mixArrayList[2])
    println("Fourth element of Array =" + mixArrayList[3])
    println("----------------------------------------")

}