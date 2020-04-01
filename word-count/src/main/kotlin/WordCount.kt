import java.util.*

object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        return phrase
                .split(Regex("'?[^\\w']+'?|'$"))
                .filter(String::isNotEmpty)
                .map { it.toLowerCase(Locale.ROOT) }
                .groupBy { it }
                .mapValues { it.value.size }
                .toMap()
    }
}
