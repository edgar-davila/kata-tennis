// Monolith coder: more methods equals more problems
class TennisGame1(private val player1Name: String, private val player2Name: String) : TennisGame {

    private var score: Scores = Scores.new()

    override fun wonPoint(playerName: String) {
        score = if (playerName === player1Name)
            score.copy(player1 = score.player1 + 1)
        else
            score.copy(player2 = score.player2 + 1)
    }

    override fun getScore() = when {
        score.isTie -> {
            ScoreName.calculateTied(score.player1)
        }
        score.isMatchGame -> {
            ScoreName.calculateWinCondition(score.player1, score.player2)
        }
        else -> ScoreName.calculateScores(score.player1, score.player2)
    }
}
