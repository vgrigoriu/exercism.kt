import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.math.pow

class Gigasecond(startTime: LocalDateTime) {
    val secondsToAdd = 10.0.pow(9).toLong()
    constructor(startDate: LocalDate) : this(startDate.atStartOfDay())

    val date: LocalDateTime = startTime.plusSeconds(secondsToAdd)
}
