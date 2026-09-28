fun main() {
    val numbers = mutableListOf(2,5,1,6)
    println(numbers.sorted())
    val laptops = mutableListOf(
        Laptop("HP",2020,1,1000),
        Laptop("Apple",2021,1,1500),
        Laptop("Acer",2023,1,1500)
    )
    laptops.sorted().forEach{println(it)}
    laptops.sortedWith(ComparatorRam()).forEach{println(it)}
    println("\n")
    laptops.sortedWith(compareBy{it.price}).forEach{println(it)}
    println("\n")
    }

data class Laptop(val brand:String, val year:Int,val ram:Int,val price:Int):Comparable<Laptop>
{
    override fun compareTo(other:Laptop):Int {
        if(this.price > other.price) {
            return 1
        }
        else if (this.price < other.price) {
            return -1
        }
        else return 0
    }
}

class ComparatorRam:Comparator<Laptop> {
    override fun compare(laptop1:Laptop,laptop2:Laptop):Int {
        if (laptop1.ram > laptop2.ram) {
            return  1
        }
        else if(laptop1 < laptop2) {
            return  -1
        }
        else {
            return 0
        }
    }
}