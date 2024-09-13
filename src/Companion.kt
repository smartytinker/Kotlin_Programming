class Hello
{
    var hello : Int = 34
}

class Hello1
{
    companion object
    {
        var hello1: Int = 10
    }
}

fun main()
{
    var A  = Hello()
    println(A.hello)
    //println(Hello.hello)
    println(Hello1.hello1)
} 