class Employee(Name : String, Age : Int, Salary : Int)
{
    var Name : String? = null
    var Age : Int? = null
    var Salary : Int? = null

    init
    {
        this.Name = Name
        this.Age = Age
        this.Salary = Salary
    }

    fun printt()
    {
        println("Name: $Name")
        println("Age: $Age")
        println("Salary: $Salary")
    }

}

class Animall           //no need for parenthesis if there are no parameters
{
    var name : String? = null
    var age : Int? = null
    var Color : String? = null

    constructor(name : String, age : Int, Color : String)
    {
        this.name = name
        this.age = age
        this.Color = Color
    }

    fun printts()
    {
        println("Name: $name")
        println("Age: $age")
        println("Color: $Color")
    }
}

class Animalls()                        //another way
{
    var name : String? = null
    var age : Int? = null
    var Color : String? = null


    constructor(name : String, age : Int, Color : String) : this()
    {
        this.name = name
        this.age = age
        this.Color = Color
    }
}

fun main(Args : Array<String>)
{
     var Siddhant = Employee("Siddhant", 24, 10000)
     Siddhant.printt()
     Siddhant.Age =  25             //easily accessible
     Siddhant.printt()


    var Dog : Animall = Animall("Bob", 23, "Brown")
    Dog.printts()
}