fun main(args: Array<String>)
{
    var a = 10
    var b = 20
    println(a+b)

    println(a.plus(b))              //this what happens in background when we do a+b

    var A = operatorr(2, 3)
    var B = operatorr(4, 5)
    var sum  = A + B

    println("${sum.x} + ${sum.y}")


}

class operatorr(var x : Int = 0, var y : Int = 12)
{
    operator fun plus(p:operatorr):operatorr
    {
        return operatorr(x + p.x, y + p.y)
    }
}