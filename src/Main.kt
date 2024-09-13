fun main(args : Array<String>)
{
    var name = "Siddhant"
    var surname = "Kadam"
    var dogname = "Bob"
    println(name + " " + surname + " has a dog named " + dogname)

    println("*********Hello Welcome to our store***********")
    var converse = readLine()               //input
    println(converse)

    var firstnum = 10
    var lastnum = 20
    var result:Int?
    result = firstnum + lastnum
    println("The Sum is $result")
    println("The Sum is ${++firstnum + lastnum + 500}") //incrementing

    println(firstnum.toString() + 10)           //concatination

    //Conditional Operators
    println(firstnum > lastnum)                 //returns boolean value


    //"When" expression
    //like switch statement
    var age = 18
    when(age)
    {
        17 -> println("17")
        18 -> println("18")
        19 -> println("19")
        else -> println("Invalid Age")
    }

    //For Loop
    for(i in 1..10)
    {
        println("This is $i th loop" )
    }


    //While Loop
    while(age <=25)
    {
        println("hlo")
        age++
    }

    var a : Int? = null
    println(a)                  //printing a null value
}

