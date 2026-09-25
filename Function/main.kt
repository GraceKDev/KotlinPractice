fun main(args:Array<String>) {
    sayHello("Mark")
    val hasInternetConnection = true
    if(hasInternetConnection) {
        getData("Data")
    }
    else {
        getData(("No Data"))
    }
}

fun sayHello (name:String) {
    println("Hello $name")
}

fun getData(data:String) {
    println("Your data is $data")
}