open class Animal()         //all classes by default are closed i.e final in kotlin so in order to inherit, we have to use the 'open' keyword
{
    var name : String? = null
    var color : String? = null
    var age : Int? = null

    constructor(name : String, color : String, age :Int) : this()        // Defining constructor explicitly
    {
        this.name = name
        this.color = color
        this.age = age
    }
}

class Lion : Animal()
{

}

fun main(Args : Array<String>)
{
    var dog : Animal = Animal()
    var bob : Lion = Lion()
    bob.name = "Bob"
    bob.age = 25
    bob.color = "Blue"
    println(bob.name)
    println(bob.color)
    println(bob.age)
}