package game.level

import levelschema.HardLevelSchema
import tiles.*

class HardLevel(private var schema:HardLevelSchema): ILevel {
    override lateinit var board: ArrayList<ArrayList<ITile>>
    override var tileFactory= TileFactory()
    override fun createLevel() {
        val length = this.schema.size / 2
        board = ArrayList()
        var x = 0
        for (i in 0 until length) {
            board.add(ArrayList(length))
            for (j in 0..length) {
                when (x) {
                    in schema.mineLocations -> board[i].add(tileFactory.getTile("mine"))
                    in schema.enemyLocations -> board[i].add(tileFactory.getTile("enemy"))
                    in schema.treasureLocations -> board[i].add(tileFactory.getTile("treasure"))
                    else -> board[i].add(tileFactory.getTile("safe"))
                }
                x++
            }
        }
    }

    init{
        createLevel()
    }
}