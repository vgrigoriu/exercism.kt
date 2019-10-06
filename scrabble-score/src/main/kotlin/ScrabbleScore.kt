object ScrabbleScore {
    fun scoreWord(input: String): Int {
        return input.map(this::scoreLetter).sum()
    }

    private fun scoreLetter(ch: Char): Int =
            when (ch.toUpperCase()) {
                'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1
                'D', 'G' -> 2
                'B', 'C', 'M', 'P' -> 3
                'F', 'H', 'V', 'W', 'Y' -> 4
                'K' -> 5
                'J', 'X' -> 8
                'Q', 'Z' -> 10
                else -> throw IllegalArgumentException("Illegal Scrabble character: $ch")
            }
}
