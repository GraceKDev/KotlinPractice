fun main(args: Array<String>) {
    for(direction in Direction.values()) {
        println(direction.direction + " " + direction.distance)
    }
    
    val direction :Direction = Direction.valueOf("EAST")
    when(direction) {
        Direction.EAST -> println("direction is East")
        Direction.NORTH -> { println("direction is North")}
        Direction.SOUTH -> { println("direction is South")}
        Direction.WEST -> { println("direction is West")}
        }

}

enum class Direction(var direction:String,var distance:Int) {
    NORTH(direction="north", distance =10),
    SOUTH(direction="south", distance =10),
    EAST(direction="east", distance =10), 
    WEST(direction="west", distance =10)
}