import scala.language.dynamics

case class SpaceAge(seconds : Long) extends Dynamic {
    private def round(x : Double) = math.round(x * 100) / 100.0
    
    private val earthYears = seconds / 31557600.0
    
    private val On = """^on(\w+)$""".r

    private val coeff = Map(
        "Mercury" -> .2408467,
        "Venus" -> .61519726,
        "Mars" -> 1.8808158,
        "Jupiter" -> 11.862615,
        "Saturn" -> 29.447498,
        "Uranus" -> 84.016846,
        "Neptune" -> 164.79132)

    def selectDynamic(onWhere : String) = onWhere match {
        case "onEarth" => round(earthYears)
        case On(where) => coeff.get(where) map {
            multiplier => round(earthYears / multiplier)
        } getOrElse {
            throw new Error("No such planet")
        }
        case _ => throw new Error("What are you trying to do ???")
    }
}
