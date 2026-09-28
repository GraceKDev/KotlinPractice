fun main() {
    val numbers = listOf("one","two","three","four")
    println(numbers.associateWith{it.length})
    println(numbers.associateBy{it.first().uppercase()})
    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))

    //flatten
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    for(numbersVals in numberSets) {
        for (number in numbersVals) {
            println(number)
        }
        println("\n")
    }
    
    val numbersFlatten = numberSets.flatten() 
    for(number in numbersFlatten) {
        println(number)
    }
}
    