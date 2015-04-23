object Hamming{
    def compute(s1: String, s2: String) = s1.zip(s2).count{case (a,b) => a != b}
}
