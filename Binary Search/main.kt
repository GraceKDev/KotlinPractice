fun main(args:Array<String>) {
    val values: MutableList<Int> = (1..25 step 2).toList()
    println(values.forEach{println(it)})
    println(searchElement2(23,values))
}

private fun searchElement(searching: Int, numbers: List<Int>): Int {
    for (number in numbers) {
        if(number == searching) {
            return number;
        }
    }
    return -1;
}

private fun searchElement2(searchElement:Int,numbers:MutableList<Int>):Int {
    var low = 0
    var high = numbers.size - 1
    var i = 0
    while(low <= high) {
        i++
        println("Searched Number $i")
        val mid = (low+high)/2
        val cmp = numbers[mid].compareTo(searchElement)
        if(cmp < 0) {
            low = mid+1
        }
        else if(cmp > 0) {
            low = mid -1
        }
        else {
            return numbers[mid]
        }
    }
    return -1
}