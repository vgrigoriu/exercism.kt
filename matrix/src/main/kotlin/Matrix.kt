class Matrix(matrixAsString: String) {

    private val rows = matrixAsString
            .lines()
            .map { line ->
                line.split(Regex("\\s+"))
                        .filter { it.isNotEmpty() }
                        .map { it.toInt() }
            }

    fun column(colNr: Int): List<Int> {
        return rows.map { row -> row[colNr - 1] }
    }

    fun row(rowNr: Int): List<Int> {
        return rows[rowNr - 1]
    }
}
