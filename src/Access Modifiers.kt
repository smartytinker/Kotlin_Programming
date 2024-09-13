//public - Default and can be accessed outside class
//private - Cannot be accessed outside class
//protected - Same as private but will be accessible to subclasses


open class Employe()
{
    var name: String = "Bob"      //private variable - can only be accessed by getters and setters(member fxns)
    private var age: Int = 30                       //default public variable
    protected var salary = 100000
    fun fxn1()
    {
        println("Name: $name")
        println("Age: $age")
        println("Salary: $salary")
    }
}

class Employe2 : Employe()
{
    fun fxn2()
    {
        println("Name: $name")
        //println("Age: $age")                  cant access it as its a private variable
        println("Salary: $salary")
    }
}

fun main(Args: Array<String>)
{
    var Bob : Employe = Employe()
    Bob.fxn1()
    //println(Bob.age)                          cant access it as its a private variable
    var Fred : Employe2 = Employe2()
    Fred.fxn2()
    //println(Fred.salary)                      cant access it as its a protected variable


}