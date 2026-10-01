fun main(args:Array<String>) {
    // val user:User = User();
    // user.firstName = "Goat";
    // user.lastName = "Kotlin";
    // user.age = 5;
    
    // val result = with(user) {
    //     firstName = "Goat";
    //     lastName = "Kotlin";
    //     age = 5;
    //     this
    // }
    // println(result);
    
    // val user = User().apply {
    //     firstName = "Goat";
    //     lastName = "Kotlin";
    //     age = 5;
    // }
    // println(user);
    // with(user) {
    //     println(firstName);
    //     println(lastName);
    //     println(age);
    // }
    // val user = User("Goat","Kotlin",28).also({
    //     println("Age is $it")
    //     println("Name is $it.firstName $it.lastName")
    // })
    
    // val text: String? = null
    // text?.let {
    //     println(it?.uppercase())
    // }
    
    val user:User? = null
    val result = user?.run {
        println(firstName)
        this
    }
    
    
}

data class User(val firstName:String, val lastName:String,val age:Int) 
// {
//     var firstName:String ="";
//     var lastName:String = "";
    
//     var age : Int = -1;
// }