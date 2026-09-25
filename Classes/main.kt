fun main() {
    val user = User("Alex","Pip",25)
    user.favoriteMovie = "Tron"
    println(user.favoriteMovie)
}

class User(name:String, var lastName:String, var age:Int) {
    lateinit var favoriteMovie : String = "Star Wars"
    
}