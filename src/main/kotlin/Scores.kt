data class Scores(val player1: Int, val player2: Int) {
    val isMatchGame: Boolean
        get() = player1 >= 4 || player2 >= 4
    val isTie: Boolean
        get() = player1 == player2

    companion object {
        fun new() = Scores(0, 0)
    }
}
