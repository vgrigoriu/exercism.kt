class Triangle(a: Double, b: Double, c: Double) {
    constructor(a: Int, b: Int, c: Int): this(a.toDouble(), b.toDouble(), c.toDouble())

    init {
        require(a + b > c && b + c > a && c + a > b)
    }

    val isScalene: Boolean = true
    val isIsosceles: Boolean = a == b || b == c || c == a
    val isEquilateral: Boolean = a == b && b == c
}
