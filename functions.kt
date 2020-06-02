// If you start with named argument you cant mix with positional argument.
fun main(){
    getName()
    print(square(10))
    print(square1(20))
    print(showMeUser("Gautham",22,true))//Positional Argument Argumnets position cant be changed while calling
    print(showMeUser1("hola",12))// Default Argument
    print(showMeUser1(age1 = 23,on1 = false,name1 = "Gautham"))// Named Argument
    countAndPrintArg(2,3,4,5,6,7,8,9,10)
}
/*
Types of Arguments
    1.Positional Argument
    2.Default Argument
    3.Named Arguments
    4.vararg can pass any amount of arguments.
 */

fun getName():String{
    return "Gautham"
}
fun square(number:Int):Int{
    return number*number
}
fun square1(number:Int):Int=number*number//You cant print anything you can just return value
fun square2(number:Int) = number*number

fun thisFunctionSHouldStartwithLowerCase(){
    //This is lowerCamelCase
}
fun countAndPrintArg(vararg number20: Int){
    print(number20.size)
    for (no in number20) println(no)

}
fun showMeUser(name:String,age:Int,On:Boolean){
    println("Name $name, age $age, $On")
}
fun showMeUser1(name1:String,age1:Int,on1:Boolean=false){ // Default Argument
    println("Name $name1, age $age1, $on1")
}

