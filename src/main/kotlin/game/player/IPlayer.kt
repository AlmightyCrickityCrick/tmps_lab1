package game.player

interface IPlayer {
    var lives:Int
    var score:Int

    fun addLives(lives:Int)
    fun loseLives(lives: Int)
    fun addScore(score:Int)

}