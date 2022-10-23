package tiles

interface ITile {
    var isChecked:Boolean
    var type:String

    fun open(){
        this.isChecked = true
    }

    abstract fun draw()
}