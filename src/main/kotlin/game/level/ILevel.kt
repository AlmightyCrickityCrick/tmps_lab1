package game.level

import tiles.ITile
import tiles.TileFactory

interface ILevel{
    var board : ArrayList<ArrayList<ITile>>
    var tileFactory : TileFactory
    abstract fun createLevel()
}
