import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runners.Parameterized.Parameters


class TennisTest {

    data class Score(val player1Score: Int, val player2Score: Int, val expectedScore: String)

    companion object {

        val allScores: Collection<Score>
            @JvmStatic
            @Parameters
            get() =
                listOf(Score(0, 0, "Love-All"),
                        Score(1, 1, "Fifteen-All"),
                        Score(2, 2, "Thirty-All"),
                        Score(3, 3, "Deuce"),
                        Score(4, 4, "Deuce"),
                        Score(1, 0, "Fifteen-Love"),
                        Score(0, 1, "Love-Fifteen"),
                        Score(2, 0, "Thirty-Love"),
                        Score(0, 2, "Love-Thirty"),
                        Score(3, 0, "Forty-Love"),
                        Score(0, 3, "Love-Forty"),
                        Score(4, 0, "Win for player1"),
                        Score(0, 4, "Win for player2"),
                        Score(2, 1, "Thirty-Fifteen"),
                        Score(1, 2, "Fifteen-Thirty"),
                        Score(3, 1, "Forty-Fifteen"),
                        Score(1, 3, "Fifteen-Forty"),
                        Score(4, 1, "Win for player1"),
                        Score(1, 4, "Win for player2"),
                        Score(3, 2, "Forty-Thirty"),
                        Score(2, 3, "Thirty-Forty"),
                        Score(4, 2, "Win for player1"),
                        Score(2, 4, "Win for player2"),
                        Score(4, 3, "Advantage player1"),
                        Score(3, 4, "Advantage player2"),
                        Score(5, 4, "Advantage player1"),
                        Score(4, 5, "Advantage player2"),
                        Score(15, 14, "Advantage player1"),
                        Score(14, 15, "Advantage player2"),
                        Score(6, 4, "Win for player1"),
                        Score(4, 6, "Win for player2"),
                        Score(16, 14, "Win for player1"),
                        Score(14, 16, "Win for player2"))
    }

    private fun checkAllScores(game: TennisGame, score: Score) {
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
            checkAllScores(TennisGame1("player1", "player2"), it)
        }
    }
}
