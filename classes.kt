fun main(){
val account:Account = Account(12345,"gautham",100f)

    account.deposit(100f)
    account.withdraw(150f)
    account.withdraw(50f)
    println(account.n)

}
class Account{
    var amt:Int =1
    var n:String=""


//class Account(var ac:Int,var n:String,var amt:Float){ // Primary Constructor
//class Account(ac:Int, n:String, amt:Float){ // Primary Constructor
//    var ac:Int
//    var n:String
//    var amt:Float
//    init {
//        this.ac = ac
//        this.amt = amt+1000
//        this.n = n.capitalize() // Converts first word Capitalized
//    }

    constructor(acc:Int){// Secondary Constructor

    }
    constructor(n:String){

    }

    //Properties



    // Constructor
    /*
    It is a function with same as Class name
    It is used to construct or initialize the class
    Two types of constructors
    1. Primary Constructor - Only 1 is possible
    2. Secondary Constructor - Multiple Secondary constructor
     */

    // Member Functions
    // this keyword means point to the current reciever, reciever means reference this always point to the current class
//    fun insert(ac:Int,n:String,amt:Float){
//        this.accNo = ac
//        this.name = n
//        this.amount = amt
//
//    }


    fun deposit(money:Float){
        amt +=money
        println(amt)
    }
    fun withdraw(money:Float){

        if(amt<money ){
            println("No suffieicient funds")
        }
        else{
            amt -=money
            println(amt)
        }
    }
}