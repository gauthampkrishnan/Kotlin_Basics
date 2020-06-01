fun main(){
    val any:Any = "Gautham"
    val b: String = any as String
    if(any is String){
        any.length
    }
}