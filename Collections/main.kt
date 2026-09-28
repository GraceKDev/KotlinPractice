fun main(args:Array<String>) {
    val names = mutableListOf<String>("Name one","Name two","Name three")
    
    
    val lastNames = setOf<String>("name one","name two","name three","name one")
    val users = mapOf<Int,String> (1 to "Maria",2 to "John")
    println(names[0])
    
    names.add("Name four")
    names.removeAt(3)
    names.forEach {
        println(it)
    }
    lastNames.forEach {
        println(it)
    }
    
    users.forEach{t,u ->
        println("$t and $u")
    }
    
}