package levelschema

class Director(var builder:ISchemaBuilder) {
    fun changeBuilder(builder:ISchemaBuilder){
        this.builder = builder
    }

    fun make(type:String){
        when(type){
            "easy" -> {
                var builder = this.builder as EasyLevelSchemaBuilder
                builder.setMines(5)
                builder.setMineLocations(intArrayOf(0, 7, 10, 15, 6))
            }
            "hard" ->{
                var builder = this.builder as HardLevelSchemaBuilder
                builder.setMines(5)
                builder.setMineLocations(intArrayOf(0, 7, 10, 15, 6))
                builder.setEnemies(2)
                builder.setEnemiesLocations(intArrayOf(5, 18))
                builder.setTreasures(1)
                builder.setTreasureLocations(intArrayOf(8))
            }

        }
    }

}