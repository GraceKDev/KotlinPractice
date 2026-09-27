fun main(args:Array<String>) {
    val success = Result.Success("Success")
    val error = Result.Error("Failed")
    getData((success))
    
}

fun getData(result:Result) {
    when(result) {
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}

sealed class Result(val message:String) {
    
    fun showMessage() {
        println("Result $message")
    }
    class Success(message:String) : Result(message)
    class Error(message:String) :Result(message)
}

