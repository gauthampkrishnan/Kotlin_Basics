// It works on vararg [vararg]: it tells that you can have n number of arguments inside any function.
val numbers = arrayOf(1,2,3,4,5)
val name = arrayOf("1","2","3","4","5")
val nameString = arrayOf<String>("1","2","3","4","5") // This is the best of which we generally use
val namestring2 = arrayOf<String>()
val num = Array(5,{i -> i*1 }) // Constructor this will create a array of size 5 and sets ith index value as i*1
// 0 1 2 3 4
val numArray = intArrayOf(1)
val nullArray = arrayOfNulls<String>(10)
fun main(){
    println(num[4])

    println(nameString.get(4))

}