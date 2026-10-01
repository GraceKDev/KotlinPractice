fun main(args :Array<String>) {
    //function that can return or accept a function
    //is a higher order function 
   
    
    //lamda is a function without a name 
    
    val myLamda = {x:Int, y:Int -> println("$x + $y = ${x + y}")};
    myLamda(5, 3);
    
    val myLamda2 = {a:Int -> println("$a")};
    myLamda2(10);
    add(5, 3, myLamda2);
    
    val loginButton = Button("Login", 1) {
        // login user
    }

    val signUpButton = Button("Sign Up", 2) {
        // sign up user
    }
}

fun add(x:Int, y:Int, action:(Int) -> Unit):Int {
    val result = x + y;
    action(result);
    action(x + y);
    return result;
}

class Button(val text:String,val id:Int,val onClickListener: () -> Unit) {
    
}

