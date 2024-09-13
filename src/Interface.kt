fun main(Args: Array<String>)
{

}

interface take      //interface = class having methods without bodies
{
    fun fxn1()
    fun fxn2()
}

class get : take
{
    override fun fxn1() {                   // click on implement members when error comes
        println("Hello world!")
    }


    override fun fxn2() {
        println("2Hello world!")
    }
}