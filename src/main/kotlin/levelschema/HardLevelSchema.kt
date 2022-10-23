package levelschema

class HardLevelSchema(
    override var mode: String,
    override var size: Int,
    override var mines: Int,
    override var mineLocations: IntArray,
    var treasures:Int,
    var treasureLocations:IntArray,
    var enemies:Int,
    var enemyLocations: IntArray
) :ILevelSchema {

    override fun clone(): HardLevelSchema {
        return HardLevelSchema(mode, size, mines, mineLocations, treasures, treasureLocations, enemies, enemyLocations)
    }
}