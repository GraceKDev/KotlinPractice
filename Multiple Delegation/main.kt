import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    
    var user = User() 
    with(user) {
        firstName = "Alex"
        lastName = "bob"
    }
    with(user) {
        println(firstName)
        println(lastName)
    }
}

class App:A by FirstDelegate(), B by SecondDelegate() {
    override fun print(): kotlin.Unit {
        TODO("Not yet implemented")
    }

    override fun print2(): kotlin.Unit {
        TODO("Not yet implemented")
    }
} 

class User {
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

interface  A {
    fun print()
}

interface  B {
    fun print2() 
}

class FirstDelegate:A {
    override fun print(): kotlin.Unit {
        TODO("Not yet implemented")
    }
}

class SecondDelegate:B {
    override fun print2(): kotlin.Unit {
        TODO("Not yet implemented")
    }
}

class FormatDelegate:ReadWriteProperty<Any?,String> {
    private var formattedString:String = ""
    
    override fun getValue(
        thisRef:Any?,
        property:KProperty<*>
    ):String {
        return formattedString
    }
    override  fun setValue(
        thisRef: Any?,
        property:KProperty<*>,
        value:String
    ) {
        formattedString = value.lowercase()
    }

}