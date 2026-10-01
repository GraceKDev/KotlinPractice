fun main(args:Array<String>) {
    val a = 5;
    val b = 0;
    try {
        val c = a / b;
        print(c);
    } catch (e: ArithmeticException) {
        print("Exception caught: ${e.message}");
    }
    finally {
        print("Finally block has been executed");
    }
}