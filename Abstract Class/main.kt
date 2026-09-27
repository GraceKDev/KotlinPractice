fun main(args: Array<String>) {
   val vehicle = Vehicle()
}

abstract class Vehicle() {
    
    
    abstract fun move() 
    abstract fun stop() 
}

class Car(name: String, color: String, engines: Int, doors: Int) : Vehicle(name, color) {
    override fun move(): kotlin.Unit {
        TODO("Not yet implemented")
    }

    override fun stop(): kotlin.Unit {
        TODO("Not yet implemented")
    }
}

