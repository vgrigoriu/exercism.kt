class Robot {

    private var _name = getNextRobotName()

    val name: String
        get() = _name

    fun reset() {
        _name = getNextRobotName()
    }

    companion object {
        private fun getNextRobotName(): String {
            val digits = getNumberAndIncrement()
            if (digits == "000") {
                incrementLetters()
            }

            return letters + digits
        }

        private var letters = "AA"
        private fun incrementLetters() {
            val lastLetter = letters.last()
            letters = if (lastLetter == 'Z') {
                letters.first().inc() + "A"
            } else {
                "" + letters.first() + lastLetter.inc()
            }
        }

        private var number = 1
        private fun getNumberAndIncrement(): String {
            val result = String.format("%03d", number)
            number = (number + 1) % 1000

            return result
        }
    }
}
