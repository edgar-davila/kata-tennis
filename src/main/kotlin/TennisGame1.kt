// Monolith coder: more methods equals more problems
class TennisGame1(private val player1Name: String, private val player2Name: String) : TennisGame {

    private var m_score1: Int = 0
    private var m_score2: Int = 0

    override fun wonPoint(playerName: String) {
        if (playerName === player1Name)
            m_score1 += 1
        else
            m_score2 += 1
    }

    override fun getScore(): String = if (m_score1 == m_score2) {
        Score.calculateTied(m_score1, m_score2)
    } else if (m_score1 >= 4 || m_score2 >= 4) {
        Score.calculateWinCondition(m_score1, m_score2)
    } else {
        Score.calculateScores(m_score1, m_score2)
    }
}
