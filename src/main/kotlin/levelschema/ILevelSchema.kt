package levelschema

interface ILevelSchema {
    var mode : String
    var size :Int
    var mines :Int
    var mineLocations : IntArray

    fun clone():ILevelSchema
}