case class Dna() {
    private val Mapping = Map('C' -> 'G', 'G' -> 'C', 'A' -> 'U', 'T' -> 'A')

    def toRna(s: String) = s map Mapping  
}
