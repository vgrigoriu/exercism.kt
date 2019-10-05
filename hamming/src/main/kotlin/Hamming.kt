object Hamming {
    fun compute(s1: String, s2: String): Int {
        return s1.zip(s2).count { (c1, c2) -> c1 != c2 }
    }
}
