package game.level

import levelschema.EasyLevelSchema
import tiles.ITile
import tiles.MineTile
import tiles.SafeTile
import tiles.TileFactory

class EasyLevel(private var schema:EasyLevelSchema): ILevel {
    override lateinit var board: ArrayList<ArrayList<ITile>>
    override var tileFactory= TileFactory()

    override fun createLevel() {
        val length = this.schema.size / 2
        board = ArrayList()
        var x  = 0
        for (i in 0 until length) {
            board.add(ArrayList())
            for (j in 0..length) {
                if (x in schema.mineLocations) board[i].add(tileFactory.getTile("mine")) else board[i].add(tileFactory.getTile("safe"))
                x++
            }
        }
    }

    init{
        createLevel()
    }
}