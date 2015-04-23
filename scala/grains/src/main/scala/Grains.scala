import scala.language.implicitConversions

object Grains {
    private implicit def i2big(i : Int) = BigInt(i)

    val total = (2 pow 64) - 1 
    val square = (for(i <- 1 to 64) yield { i -> (2 pow (i - 1)) }).toMap
}
