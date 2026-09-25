fun main() {
    val result = Calculator.sum(5,b=10)
    println(result)
}

class Calculator() {
    companion object {
        fun sum(a:Int,b:Int):Int {
            var max = 100
            return a+b
        }
    }
    
}