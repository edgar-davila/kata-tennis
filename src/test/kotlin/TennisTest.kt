import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runners.Parameterized.Parameters


class TennisTest {

    data class ScoreScenario(val player1Score: Int, val player2Score: Int, val expectedScore: String)

    companion object {

        val allScores: Collection<ScoreScenario>
            @JvmStatic
            @Parameters
            get() =
                listOf(ScoreScenario(0, 0, "Love-All"),
                        ScoreScenario(1, 1, "Fifteen-All"),
                        ScoreScenario(2, 2, "Thirty-All"),
                        ScoreScenario(3, 3, "Deuce"),
                        ScoreScenario(4, 4, "Deuce"),
                        ScoreScenario(1, 0, "Fifteen-Love"),
                        ScoreScenario(0, 1, "Love-Fifteen"),
                        ScoreScenario(2, 0, "Thirty-Love"),
                        ScoreScenario(0, 2, "Love-Thirty"),
                        ScoreScenario(3, 0, "Forty-Love"),
                        ScoreScenario(0, 3, "Love-Forty"),
                        ScoreScenario(4, 0, "Win for player1"),
                        ScoreScenario(0, 4, "Win for player2"),
                        ScoreScenario(2, 1, "Thirty-Fifteen"),
                        ScoreScenario(1, 2, "Fifteen-Thirty"),
                        ScoreScenario(3, 1, "Forty-Fifteen"),
                        ScoreScenario(1, 3, "Fifteen-Forty"),
                        ScoreScenario(4, 1, "Win for player1"),
                        ScoreScenario(1, 4, "Win for player2"),
                        ScoreScenario(3, 2, "Forty-Thirty"),
                        ScoreScenario(2, 3, "Thirty-Forty"),
                        ScoreScenario(4, 2, "Win for player1"),
                        ScoreScenario(2, 4, "Win for player2"),
                        ScoreScenario(4, 3, "Advantage player1"),
                        ScoreScenario(3, 4, "Advantage player2"),
                        ScoreScenario(5, 4, "Advantage player1"),
                        ScoreScenario(4, 5, "Advantage player2"),
                        ScoreScenario(15, 14, "Advantage player1"),
                        ScoreScenario(14, 15, "Advantage player2"),
                        ScoreScenario(6, 4, "Win for player1"),
                        ScoreScenario(4, 6, "Win for player2"),
                        ScoreScenario(16, 14, "Win for player1"),
                        ScoreScenario(14, 16, "Win for player2"))
    }

    private fun checkScore(game: TennisGame, score: ScoreScenario) {
        val highestScore = Math.max(score.player1Score, score.player2Score)
        for (i in 0 until highestScore) {
            if (i < score.player1Score)
                game.wonPoint("player1")
            if (i < score.player2Score)
                game.wonPoint("player2")
        }
        assertEquals(score.expectedScore, game.getScore())
    }

    @Test
    fun checkAllScoresTennisGame1() {
        allScores.forEach {
            checkScore(TennisGame1("player1", "player2"), it)
        }
    }
}
