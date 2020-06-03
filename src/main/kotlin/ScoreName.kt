class ScoreName {
    companion object {
        private const val LOVE_ALL = "Love-All"
        private const val FIFTEEN_ALL = "Fifteen-All"
        private const val THIRTY_ALL = "Thirty-All"

        private const val ADVANTAGE_PLAYER_1 = "Advantage player1"
        private const val ADVANTAGE_PLAYER_2 = "Advantage player2"
        private const val WIN_PLAYER_1 = "Win for player1"
        private const val WIN_PLAYER_2 = "Win for player2"

        private const val DEUCE = "Deuce"
        private const val LOVE = "Love"
        private const val FIFTEEN = "Fifteen"
        private const val THIRTY = "Thirty"
        private const val FORTY = "Forty"

        fun calculateTied(score: Int): String {
            return when (score) {
                0 -> LOVE_ALL
                1 -> FIFTEEN_ALL
                2 -> THIRTY_ALL
                else -> DEUCE
            }
        }

        fun calculateWinCondition(score1: Int, score2: Int): String {
            val minusResult = score1 - score2
            return when {
                minusResult == 1 -> ADVANTAGE_PLAYER_1
                minusResult == -1 -> ADVANTAGE_PLAYER_2
                minusResult >= 2 -> WIN_PLAYER_1
                else -> WIN_PLAYER_2
            }
        }

        fun calculateScores(score1: Int, score2: Int): String {
            return getValue(score1) + "-" + getValue(score2)
        }

        fun getValue(score: Int): String {
            return when (score) {
                0 -> LOVE
                1 -> FIFTEEN
                2 -> THIRTY
                3 -> FORTY
                else -> throw Exception()
            }
        }
    }
}