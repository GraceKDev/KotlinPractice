fun main(args: Array<String>) {
   val car = Car("BMW","Red",1,2)
   val plane = Plane("Boeing","White",4,4)
   car.move()
   car.stop()
   plane.move()
   plane.stop()
   }

open class Vehicle(val name:String, val color:String) {
    open fun move() {
        println("$name is moving")
    }
    fun stop() {
        println("$name has stopped")
    }
}

class Car(name: String, color: String, engines: Int, doors: Int) : Vehicle(name, color) {
    
}

class Plane(name: String, color: String, engines: Int, doors: Int) : Vehicle(name, color) {
    override fun move() {
        println("The plane $name has come to a stop")
    }
}

