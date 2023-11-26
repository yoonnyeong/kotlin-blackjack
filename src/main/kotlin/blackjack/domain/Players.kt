package blackjack.domain

data class Players(val players: List<Player>) {
    fun getNames(): List<String> {
        return players.map { it.name }
    }

    fun receiveCards(cards: List<Card>) {
        players.forEachIndexed { index, player ->
            player.receiveCard(cards[index])
        }
    }

    fun getHits(): List<Player> {
        return players.filter { it.status == Status.HIT }
    }
}