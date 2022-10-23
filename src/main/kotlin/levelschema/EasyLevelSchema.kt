package levelschema

class EasyLevelSchema(
    override var mode: String,
    override var size: Int,
    override var mines: Int,
    override var mineLocations: IntArray
) :ILevelSchema{
    override fun clone(): ILevelSchema {
        return EasyLevelSchema(mode, size, mines, mineLocations)
    }
}