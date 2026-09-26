fun main(args:Array<String>) {
    val instance = Database.getInstance()
    println(instance)
    println(DatabaseObject)
    println(DatabaseObject)
}

class Database private constructor() {
    companion object {
        
        private var instance :Database? = null
        fun getInstance():Database? {
            if(instance === null) {
                instance = Database()
            }
            return instance
        }
    }
}

object DatabaseObject {
    init {
        println("Database $this")
    }
}