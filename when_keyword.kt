fun main(){
    // When is used instead of switch
    val any:Any = "Gautham"
   val x= when(any){
        "goofy" ->{

        }
        "Gautham"->{
          println("Name")

        }
        "Name"->{

        }
        else->{

        }

    }
    val y= when(any){
        "goofy" ->"Hola $any"
        "Gautham"->"Name $any"
        "Name"->"amigo $any"
        else->"Not a valid name"
    }
    print(y)
}