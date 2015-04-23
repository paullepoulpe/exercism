import java.util.Calendar
import java.util.Calendar._

case class Gigasecond(date : Calendar) {
    /* Add a gigasecond */
    date.add(SECOND, 1000000000)

    /* Reset the time of day */
    date.set(SECOND, 0)
    date.set(MINUTE, 0)
    date.set(HOUR, 0)
}
