fun main(Args :Array<String>)
{

    println("${add(2,3)}")
    println("${mult(3,2)}")
}
fun add(a : Int, b : Int)     //We can't define var or val in parameters
{                               //Default function type is unit i.e void
    println(a+b)
}

fun sub(a : Int, b : Int)  : Unit    //Defining Unit which is already default
{
    println(a-b)
}

fun mult(a: Int, b: Int):Int
{
    return(a*b)
}