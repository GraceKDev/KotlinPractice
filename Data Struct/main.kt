fun main(args:Array<String>) {
    val name1 = "Alex"
    val name2 = "Alex"
    println(name1 == name2)
    // Structurally equal 
    val name3 = "Liam"
    val name4 = "Lian"
    println(name3 == name4)
    // Structurally not equal 
    
    // this is called structual equality 
    
    //reference equality 
    println(name1 === name1)
    // this will be true as they're the same variable 
    
    println(name1 === name2) 
    // this will be false as they're referencing different vars
    
    
    val user1 = User("john","smith",23)
    val user2 = User("john","smith",23)
    println(user1.equals(user2))
    // will be false... even though they look structually equal 
    // the reason for this is because when an object
    // is used it will implicity use its own equals function
    // we need to override it 
    
    // hashcode needs to be equal 
    // hashcode is needed for performance collections 
    println(user1)
    
}

class User(var firstName:String ,var lastName:String,var age:Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other is User) {
            if(other.age == this.age)
                if(other.firstName == this.firstName)
                    if(other.lastName == this.lastName) {
                        return  true;
                    }
            
        }
        return  false
    }

    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "User{firstName = $firstName, lastName = $lastName , age = $age}"
    }
}
