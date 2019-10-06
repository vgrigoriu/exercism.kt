import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.math.pow

class Gigasecond(startTime: LocalDateTime) {
    constructor(startDate: LocalDate) : this(startDate.atStartOfDay())

    private val gigaSecond = 10.0.pow(9).toLong()

    val date: LocalDateTime = startTime.plusSeconds(gigaSecond)
}
