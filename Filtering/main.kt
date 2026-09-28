fun main() {
    val numbers = listOf("one","two","three","four")
    val longerThanThree = numbers.filter{it.length > 3}
    val numbersMap = mapOf("key 1" to 1,"key 2" to 2, "key3" to 3)
    
    val filterMap = numbersMap.filter{it.key.endsWith(suffix="2") && it.value > 1}
    println(longerThanThree)
    println(filterMap)
    
    val filteredIndex = numbers.filterIndexed { index, value ->
        index % 2 == 0 && value.length > 3
    }
    println(filteredIndex)
    
    val filterNot = numbers.filterNot{it.length <= 3}
    println(filterNot)  
    
    val mixedList = listOf("one",2,3,"four",'a','b')  
    
    mixedList.filterIsInstance<Char>().forEach{println(it)}
    
    //Partition 
    
    val (match,rest)  = numbers.partition{it.length >3}
    println(match)
    println(rest)
    
    
    println(numbers.any{it.endsWith(suffix="e")})
    }
    
    