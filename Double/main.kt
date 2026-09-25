fun main() {
    val myNumber= 2.5
    //By default kotlin infer double for decimal 
    // You need to supply a F 
    val myNumber2 = 2.5F
    // This now infers as a float
    
    println ("myNumber = $myNumber and myNumber2 = $myNumber2")
    
    // float has less precision than a double.
}