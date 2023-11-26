package blackjack.view

import blackjack.domain.Player
import blackjack.domain.Players

object InputView {
    fun getPlayers(): Players {
        println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
        val players = readln().replace(" ","").split(",").map { Player(it) }
        return Players(players)
    }

    fun askPlayer(playerName: String): Boolean {
        println("${playerName}는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)")
        val answer = readln().trim()
        require(answer == "y" || answer == "n") { "y 또는 n 만 입력가능합니다." }
        return answer == "y"
    }
}