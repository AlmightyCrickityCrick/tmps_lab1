package game

import game.level.EasyLevel
import game.level.HardLevel
import game.level.ILevel
import game.player.IPlayer
import levelschema.ILevelSchema
import java.lang.IllegalArgumentException

abstract class AbstractGameFactory() {
    abstract fun createLevel(schema:ILevelSchema): ILevel
    abstract fun createPlayer():IPlayer

    companion object{
        inline fun <reified T:ILevel> create(): AbstractGameFactory = when(T::class){
            EasyLevel::class -> EasyGameFactory()
            HardLevel::class -> HardGameFactory()
            else -> throw IllegalArgumentException()
        }
    }
}