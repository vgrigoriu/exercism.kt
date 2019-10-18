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
        val candidatesFromColumns = (0 until numbers[0].size)
                .flatMap { col -> indicesOfMins(col).map { MatrixCoordinate(it, col) } }

        return candidatesFromRows.intersect(candidatesFromColumns)
    }

    private fun indicesOfMaxes(rowNo: Int): Set<Int> {
        require(numbers[rowNo].isNotEmpty())
        var indices = listOf(0)
        var max = numbers[rowNo][0]
        for (i in 1 until numbers[rowNo].size) {
            if (numbers[rowNo][i] > max) {
                max = numbers[rowNo][i]
                indices = listOf(i)
            } else if (numbers[rowNo][i] == max) {
                indices = indices + i
            }
        }
        return indices.toSet()
    }

    private fun indicesOfMins(colNo: Int): Set<Int> {
        require(colNo < numbers.size)
        var indices = listOf(0)
        var min = numbers[0][colNo]
        for (i in 1 until numbers.size) {
            if (numbers[i][colNo] < min) {
                min = numbers[i][colNo]
                indices = listOf(i)
            } else if (numbers[i][colNo] == min) {
                indices = indices + i
            }
        }
        return indices.toSet()
    }
}
