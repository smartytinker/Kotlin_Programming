class Outside
{
    var name : String = "Bob"
    fun print1()
    {
        println("Name : $name")

    }

    class Inside
    {
        var age : Int = 10
        fun print2()
        {
            println("Age : $age")
        }
    }
}


fun main(args : Array<String>)
{
    var A : Outside = Outside()
    A.print1()

   // var B : Outside.Inside = Inside()
   // B.print2()

    println(Outside.Inside().age)
}