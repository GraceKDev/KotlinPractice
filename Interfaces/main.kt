fun main(args:Array<String>) {
    
}

interface Engine {
    fun startEngine()
    fun stopEngine() 
    
}

class Car(val name:String, val Colour:String):Engine {
   override fun startEngine() {
        
    }
   override fun stopEngine() {
        
    }
    
}

class Truck(val name:String, val colour:String)