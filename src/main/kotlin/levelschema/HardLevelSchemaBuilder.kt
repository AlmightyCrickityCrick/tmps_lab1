package levelschema

class HardLevelSchemaBuilder :ISchemaBuilder{
    override var prototype: ILevelSchema = HardLevelSchema("hard", Constants.HARD_BOARD_SIZE, 0, intArrayOf(0), 0, intArrayOf(0), 0, intArrayOf(0))
    var result: HardLevelSchema = prototype.clone() as HardLevelSchema

    override fun reset() {
        this.result = prototype.clone()  as HardLevelSchema
    }
    override fun setSize() {
        result.size = Constants.HARD_BOARD_SIZE
    }

    override fun setMode() {
        result.mode = "hard"
    }

    override fun setMines(mines:Int) {
        result.mines = mines
    }

    override fun setMineLocations(loc:IntArray) {
        result.mineLocations = loc
    }

    fun setTreasures(tres:Int) {
        result.treasures = tres
    }

    fun setTreasureLocations(loc:IntArray) {
        result.treasureLocations = loc
    }

     fun setEnemies(en:Int) {
        result.enemies = en
    }

    fun setEnemiesLocations(loc:IntArray) {
        result.enemyLocations = loc
    }

    override fun build(): ILevelSchema {
        return this.result
    }
}