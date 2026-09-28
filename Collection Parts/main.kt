fun main() {
    val numbers = listOf("One","Two","Three","Four","Five")
    println(numbers.slice(1..3))
    println(numbers.slice(0..4 step 2))
    println(numbers.slice(setOf(3,4,0)))
    
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(1))
    println(numbers.dropLast(4))
    
    println(numbers.takeWhile{!it.startsWith("f")})
    println(numbers.takeLastWhile{it != "Three"})
    println(numbers.dropWhile{it.length == 3})
    println(numbers.dropLastWhile{it.contains("i")})
    }    
    