package game.player

class HardPlayer:IPlayer {
    override var lives: Int = 3
    override var score: Int = 0
    override fun addLives(lives: Int) {
        this.lives+=lives
    }

    override fun loseLives(lives: Int) {
        this.lives-=lives
    }

    override fun addScore(score: Int) {
        this.score+=score
    }

    fun fight(){
        if ((0..1).random() == 1) addScore(100) else loseLives(1)
    }

}