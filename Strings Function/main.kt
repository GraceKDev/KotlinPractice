fun main() {
    val numberStrings = listOf("one","two","three","four")
    println(numberStrings)
    println(numberStrings.joinToString())
    val listString = StringBuffer("The List of Numbers: ")
    println(numberStrings.joinTo(listString))
    
    
    println(numberStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
    val numbers = (1..100).toList() 
    println(numbers.joinToString(limit=15,truncated = "<...>"))
    println(numberStrings.joinToString{"Element:${it.uppercase()}"})
    }