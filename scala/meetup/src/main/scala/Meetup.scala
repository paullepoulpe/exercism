import java.util.GregorianCalendar
import java.util.Calendar


case class Meetup(month : Int, year : Int) extends Enumeration{
    import Meetup._
    
    /* Too lengthy to type otherwise */
    type Cal = GregorianCalendar

    def first(d : WeekDay) : Cal = Date(1, month, year) next d
    def second(d : WeekDay) : Cal = Date(8, month, year) next d
    def third(d : WeekDay) : Cal = Date(15, month, year) next d
    def fourth(d : WeekDay) : Cal = Date(22, month, year) next d
    def teenth(d : WeekDay) : Cal = Date(13, month, year) next d
    def last(d : WeekDay) : Cal = Date(1, month, year) lastOfMonth d
}

object Meetup extends Enumeration {
    type WeekDay = Value
    val Sun = Value(1)  
    val Mon = Value(2)
    val Tue = Value(3)
    val Wed = Value(4)
    val Thu = Value(5)
    val Fri = Value(6)
    val Sat = Value(7)
}

case class Date(day : Int, month : Int, year : Int){
    import Meetup._

    val cal = new GregorianCalendar(year, month - 1, day)

    def is(wd : WeekDay) = cal.get(Calendar.DAY_OF_WEEK) == wd.id

    def next(wd : WeekDay) = { 
        val dates = for(d <- day to (day + 7)) yield Date(d, month, year)
        dates.filter(_ is wd).head
    }

    def lastOfMonth(wd : WeekDay) = {
        val days = cal.getActualMaximum(Calendar.DAY_OF_MONTH)
        Date(days -  6, month, year).next(wd)
    }
}

object Date {
    import scala.language.implicitConversions

    implicit def date2cal(d : Date): GregorianCalendar = d.cal
}
