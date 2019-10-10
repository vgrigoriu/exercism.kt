class Triangle(a: Double, b: Double, c: Double) {
    constructor(a: Int, b: Int, c: Int): this(a.toDouble(), b.toDouble(), c.toDouble())

    val isScalene: Boolean = true
    val isIsosceles: Boolean = true
    val isEquilateral: Boolean = true
}
