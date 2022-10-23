package game

import game.level.EasyLevel
import game.level.ILevel
import game.player.EasyPlayer
import game.player.IPlayer
import levelschema.EasyLevelSchema
import levelschema.ILevelSchema

class EasyGameFactory() : AbstractGameFactory() {
    override fun  createLevel(schema:ILevelSchema): ILevel {
        val easySchema = schema as EasyLevelSchema
        return EasyLevel(easySchema)
    }

    override fun createPlayer(): IPlayer {
        return EasyPlayer()
    }
}