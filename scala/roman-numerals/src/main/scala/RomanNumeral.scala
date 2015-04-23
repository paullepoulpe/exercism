import scala.annotation.tailrec

case class RomanNumeral(num : Int){
    private val Arabic2RomanUnits = Map(1 -> "I", 10 -> "X", 100 -> "C",  1000 -> "M")
    private val Arabic2Roman = Arabic2RomanUnits ++ Map(5 -> "V", 50 -> "L", 500 -> "D")
    
    private def getNextElements(num : Int) : (String, Int) = {
        val (unit, i) = Arabic2RomanUnits.filter(_._1 <= num).maxBy(_._1)
        lazy val v = Arabic2Roman(5 * unit)
        lazy val x = Arabic2Roman(10 * unit)
        
        val nb = num / unit
        val floor = nb * unit

        if(nb < 4) (i * nb, floor)
        else if(nb == 4) (i + v, floor)
        else if(nb < 9) (v + i * (nb - 5), floor)
        else (i + x, floor)
    }

    @tailrec private def toRoman(num : Int, accu : String = "") : String = 
        if (num == 0) accu else {
            val (roman, arab) = getNextElements(num)
            toRoman(num - arab, accu + roman)
        }
    
    val value = toRoman(num)
}

