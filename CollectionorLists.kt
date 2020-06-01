//Lists or Collection lists are immutable cant add values
var listOfNames = listOf<String>("Hello","World","Gautham")
var mutablelistOfNames = mutableListOf<String>("Hello","World","Gautham")
var mutableArrayListofNames = arrayListOf<String>("Hello","world")
var mapOfNames = mapOf<Int,String>(0 to "Gautham",1 to "22") //Immutable
var hashmapOfNames = hashMapOf<Int,String>(0 to "Gautham",1 to " 22") // Mutable

fun main(){
    mutablelistOfNames.add("Goofy")
    println(mapOfNames[0])
    hashmapOfNames[0]="Gautham P Krishnan"
    print(hashmapOfNames[0])
    hashmapOfNames.forEach{(any,any2)->
        println(""+any+any2)
    }
    mutablelistOfNames.forEach{
        println(it)
    }
    nameString.forEach {
        println(it)
    }
}