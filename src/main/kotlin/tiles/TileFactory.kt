package tiles

class TileFactory {

    fun getTile(type:String): ITile{
        return when(type){
            "mine" -> MineTile()
            "enemy" -> EnemyTile()
            "treasure" -> TreasureTile()
            else -> SafeTile()
        }
    }

}