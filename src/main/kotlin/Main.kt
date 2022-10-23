import game.AbstractGameFactory
import game.EasyGameFactory
import game.HardGameFactory
import game.level.EasyLevel
import game.level.HardLevel
import game.level.ILevel
import game.player.IPlayer
import levelschema.*

fun main(){
    var levelBuilder:ISchemaBuilder = EasyLevelSchemaBuilder()
    var director = Director(levelBuilder)
    director.make("easy")
    var levelSchema: ILevelSchema = (levelBuilder as EasyLevelSchemaBuilder).result
    println(levelSchema)
    var gameLevel = AbstractGameFactory.create<EasyLevel>().createLevel(levelSchema)
    var gamePlayer = AbstractGameFactory.create<EasyLevel>().createPlayer()

    println(gameLevel.board)
    println(gamePlayer.toString())

    levelBuilder = HardLevelSchemaBuilder()
    director.changeBuilder(levelBuilder)
    director.make("hard")
    levelSchema = (levelBuilder as HardLevelSchemaBuilder).result
    println(levelSchema)
    gameLevel = AbstractGameFactory.create<HardLevel>().createLevel(levelSchema)
    gamePlayer = AbstractGameFactory.create<HardLevel>().createPlayer()

    println(gameLevel.board)
    println(gamePlayer.toString())

}