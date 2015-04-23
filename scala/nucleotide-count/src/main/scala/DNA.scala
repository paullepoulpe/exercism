class DNA(s: String) {
    val nucleotides = "AGTC".toSeq

    def isNucleotide(c: Char) = nucleotides.contains(c)
    
    if (!s.forall(isNucleotide)) throw new IllegalArgumentException

    def count(c: Char) : Int = if(isNucleotide(c)) {
            s.count(_ == c) 
        } else {
            throw new IllegalArgumentException
        }
   
    def nucleotideCounts : Map[Char, Int] = nucleotides.map(n => (n -> count(n))).toMap
}
