fun main(args:Array<String>) {
    //it becomes the single parameter so it becomes the default name of the parameter
    upperCase("hello world") { it.uppercase() }
}

fun upperCase(str:String,myFunction: (String) -> String) {
    val upperCaseString = myFunction(str);
    println(upperCaseString);
    
}