class Triangle(a: Double, b: Double, c: Double) {
    constructor(a: Int, b: Int, c: Int): this(a.toDouble(), b.toDouble(), c.toDouble())

    init {
        require(a != 0.0 && b != 0.0 && c != 0.0)
    }

    val isScalene: Boolean = true
    val isIsosceles: Boolean = true
    val isEquilateral: Boolean = a == b && b == c
}
