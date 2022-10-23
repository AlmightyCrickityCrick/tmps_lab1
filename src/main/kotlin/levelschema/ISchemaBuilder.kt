package levelschema

interface ISchemaBuilder {
    var prototype:ILevelSchema
    abstract fun reset()
    abstract fun setSize()
    abstract fun setMode()
    abstract fun setMines(mines:Int)
    abstract fun setMineLocations(loc:IntArray)
    fun build(): ILevelSchema
}