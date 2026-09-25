fun main(args: Array<String>) {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0
    var oddNumberCounter = 0
    while (number <= lastNumber) {
        number++

        if ((number % 2) != 0) {
            continue
        }
        evenNumberCounter++
        println(number)
    }
    println("Total number of even numbers found = $evenNumberCounter")
    for (i in 1..20) {
        if ((i % 2) == 0) {
            continue
        } else {
            oddNumberCounter++

        }

    }
    println("Total number of even $evenNumberCounter")
    println("Total number of odd $oddNumberCounter")

}