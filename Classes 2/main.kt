fun main() {
    val user = User("Alex","Pip",25)
    val friend = User(name="John","Street",35)
    println("Name of friend ${friend.name} ${friend.lastName}")
    }

class User(name:String, var lastName:String, var age:Int) {
    var name:String 
    
    init {
        if (name.lowercase().startsWith("a")) {
            this.name  = name
        }
        else {
            this.name = "User"
            println("The name doesn't start with the letter 'a'")
        }
    }
}