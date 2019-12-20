class Matrix(private val numbers: List<List<Int>>) {

    // a "saddle point" [...] is greater than or equal to
    // every element in its row and less than or equal to every element in
    // its column
    val saddlePoints: Set<MatrixCoordinate> = computeSaddlePoints()

    private fun computeSaddlePoints(): Set<MatrixCoordinate> {
        if (numbers.all { it.isEmpty() })
            return emptySet()

        val candidatesFromRows = numbers.indices
                .flatMap { row -> indicesOfMaxes(row).map { MatrixCoordinate(row, it) } }
        val candidatesFromColumns = numbers[0].indices
                .flatMap { col -> indicesOfMins(col).map { MatrixCoordinate(it, col) } }

        return candidatesFromRows.intersect(candidatesFromColumns)
    }

    private fun indicesOfMaxes(rowNo: Int): Set<Int> {
        require(numbers[rowNo].isNotEmpty())

        val values = numbers[rowNo]
        val max = values.max()
        return values.withIndex()
                .filter { it.value == max }
                .map { it.index }
                .toSet()
    }

    private fun indicesOfMins(colNo: Int): Set<Int> {
        require(colNo < numbers.size)

        val values = numbers.indices.map { numbers[it][colNo] }
        val min = values.min()
        return values.withIndex()
                .filter { it.value == min }
                .map { it.index }
                .toSet()
    }
}
