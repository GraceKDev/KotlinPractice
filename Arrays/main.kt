fun main(args :Array<String>) {
    val max:Int = findMax(arrayOf(3,20,5,6,7))
    println("Maximum value = $max");
}

fun findMax(numbers:Array<Int>):Int {
    var maximum = 0;
    for (number in numbers) {
        if(number > maximum) {
            maximum = number
        }
        else {
            continue;
        }
    }
    return maximum
}