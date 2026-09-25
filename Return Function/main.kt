fun main(args:Array<String>) {
    println(getMax(a = 20, b =30))
}

fun getMax(a:Int,b:Int) :Int {
    val max = if(a > b) a else b 
    return max
}