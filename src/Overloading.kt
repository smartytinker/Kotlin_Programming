class Employeee()
{
    var name : String ? = null
    var age : Int? = null
    var salary : Int? = null

    constructor(name: String, age : Int, salary : Int):this()
    {
        this.name = name
        this.age = age
        this.salary = salary
        println("Name : $name")
        println("Age : $age")
        println("Salary : $salary")
    }

    constructor(name:String, age : Int):this()
    {
        this.name = name
        this.age = age
        println("Name : $name")
        println("Age : $age")
    }
}

fun main()
{
    var Bob : Employeee = Employeee("Bob", 23, 200000)
    println("################################")
    var Fred : Employeee = Employeee("Fred", 23)
}
