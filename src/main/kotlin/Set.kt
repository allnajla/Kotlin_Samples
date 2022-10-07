         fun main(){

             var myList = arrayListOf<Any>("kotlin",2,2,10,'N',false,"kotlin")
             println("List size"+ myList.size)
             println("List Last element"+myList.last())

             var mySet = setOf<Any>("kotlin",2,2,10,'N',false,"kotlin")
             println("Set size"+ mySet.size)
             println("Set Last element"+ mySet.last())
         }