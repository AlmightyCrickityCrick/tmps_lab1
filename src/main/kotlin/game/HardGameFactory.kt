package game

import game.level.HardLevel
import game.level.ILevel
import game.player.HardPlayer
import game.player.IPlayer
import levelschema.HardLevelSchema
import levelschema.ILevelSchema

class HardGameFactory() : AbstractGameFactory() {
    override fun createLevel(schema:ILevelSchema): ILevel {
        val hardLevelSchema = schema as HardLevelSchema
        return HardLevel(hardLevelSchema)
    }

    override fun createPlayer(): IPlayer {
        return HardPlayer()
    }
}