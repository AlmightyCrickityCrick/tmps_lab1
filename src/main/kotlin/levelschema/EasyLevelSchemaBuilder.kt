package levelschema

class EasyLevelSchemaBuilder :ISchemaBuilder {
     override var prototype : ILevelSchema = EasyLevelSchema("easy", Constants.EASY_BOARD_SIZE, 0, intArrayOf(0))
     var result :EasyLevelSchema = prototype.clone() as EasyLevelSchema

    override fun reset(){
        this.result = prototype.clone() as EasyLevelSchema
    }

    override fun setSize(){
        result.size = Constants.EASY_BOARD_SIZE
    }
    override fun setMode(){
        result.mode = "easy"
    }

    override fun setMines(mines:Int){
        this.result.mines = mines
    }

    override fun setMineLocations(loc:IntArray) {
        this.result.mineLocations = loc
    }

    override fun build(): ILevelSchema {
        return this.result
    }
}