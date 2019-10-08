class Squares(private val n: Int) {
    private val sum =  n * (n + 1) / 2

    fun squareOfSum(): Int {
        return sum * sum
    }

    fun sumOfSquares(): Int {
        return n * (n+1) * (2*n + 1) / 6
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
