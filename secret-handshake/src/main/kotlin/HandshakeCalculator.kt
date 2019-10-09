object HandshakeCalculator {
    fun calculateHandshake(n: Int): List<Signal> {
        return mutations
                .filter { (bit, _) -> bit and n != 0 }
                .fold(listOf(), { acc, (_, op) -> op(acc) })
    }

    private val mutations = listOf(
            Pair(1, { l: List<Signal> -> l.plus(Signal.WINK) }),
            Pair(2, { l: List<Signal> -> l.plus(Signal.DOUBLE_BLINK) }),
            Pair(4, { l: List<Signal> -> l.plus(Signal.CLOSE_YOUR_EYES) }),
            Pair(8, { l: List<Signal> -> l.plus(Signal.JUMP) }),
            Pair(16, { l: List<Signal> -> l.reversed() })
    )
}
