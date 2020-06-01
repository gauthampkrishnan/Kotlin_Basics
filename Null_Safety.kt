fun main(){
    var f:String? = null
    f = "Gautham"
    val size:Int? = f?.length?: 0 // Elvis Operator
    println(size)
}