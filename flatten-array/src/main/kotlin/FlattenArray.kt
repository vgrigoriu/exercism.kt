object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        return source.filterNotNull().map { it }
    }
}
