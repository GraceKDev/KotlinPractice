fun main(args:Array<String>) {
    val footballPlayer = FootballPlayer("John")
    val footballPlayer2 = FootballPlayer("Eric")
    val baseballPlayer = BaseballPlayer("Frank")
    val team = Team<FootballPlayer>("Tim",mutableListOf(footballPlayer))
    val team2 = Team<BaseballPlayer>(name ="Crow",mutableListOf(baseballPlayer))
    team.addPlayer(footballPlayer2)
    
    
    }

class Team<T:Player>(val name:String,val players:MutableList<T>) {
    fun addPlayer(player:T) {
        if(players.contains(player)) {
            println("Player: ${(player as Player).name} is already on the team ${this.name}")
        }
        else {
            players.add((player)) 
            println("Player: ${(player as Player).name} was added to the team ${this.name}")
        }
    } 
}

open class Player(val name:String)

class FootballPlayer(name:String) :Player(name)
class BaseballPlayer(name:String) : Player(name)