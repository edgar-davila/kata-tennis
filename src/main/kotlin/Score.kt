enum class Score(val type: String) {
    LOVE_ALL("Love-All"),
    FIFTEEN_ALL("Fifteen-All"),
    THIRTY_ALL("Thirty-All"),
    ADVANTAGE_PLAYER_1("Advantage player1"),
    ADVANTAGE_PLAYER_2("Advantage player2"),
    WIN_PLAYER_1("Win for player1"),
    WIN_PLAYER_2("Win for player2"),
    DEUCE("Deuce");


    companion object {
        fun calculateTied(score1: Int, score2: Int): Score {
            return when(score1) {
                0 ->  LOVE_ALL
                1 -> FIFTEEN_ALL
                2 -> THIRTY_ALL
                else -> DEUCE
            }
        }

        fun calculateWinCondition(score1: Int, score2: Int): Score {
            val minusResult = score1 - score2
            return when {
                minusResult == 1 -> Score.ADVANTAGE_PLAYER_1
                minusResult == -1 -> Score.ADVANTAGE_PLAYER_2
                minusResult >= 2 -> Score.WIN_PLAYER_1
                else -> Score.WIN_PLAYER_2
            }
        }
    }
}