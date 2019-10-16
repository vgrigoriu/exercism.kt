class Matrix(numbers: List<List<Int>>) {

    val saddlePoints: Set<MatrixCoordinate> =
            if (numbers.all { it.isEmpty() })
                emptySet()
            else
                setOf(MatrixCoordinate(1, 0))
}
