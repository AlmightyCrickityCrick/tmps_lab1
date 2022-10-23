package game.player

class EasyPlayer :IPlayer {
    override var lives: Int = 1
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


}