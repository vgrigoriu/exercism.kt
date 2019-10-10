class Triangle(a: Double, b: Double, c: Double) {
    constructor(a: Int, b: Int, c: Int): this(a.toDouble(), b.toDouble(), c.toDouble())

    init {
        require(a + b > c && b + c > a && c + a > b)
    }

    val isEquilateral: Boolean = a == b && b == c
    val isIsosceles: Boolean = a == b || b == c || c == a
    val isScalene: Boolean = !isIsosceles
}
