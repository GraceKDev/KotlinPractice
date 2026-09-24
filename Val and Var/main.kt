fun main() {
    var name = "John" 
    // Kotlin is read at compile time so types 
    // are static

    println("Hello $name")

    val name2 = "Smith" 
    // name2 = 'jane'
    // val is the const 
    println("Hello $name2")

    // Kotlin is inferred so it can figure out the type
    // based on the value
    var name3:String = "Joanne"

    println("Hello $name3")
}