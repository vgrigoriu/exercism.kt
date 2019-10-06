import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(startTime: LocalDateTime) {
    constructor(startDate: LocalDate) : this(startDate.atStartOfDay())

    val date: LocalDateTime = TODO()
}
