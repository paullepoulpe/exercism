class Robot {
    
    private val random = new scala.util.Random()

    private def randLetter : Char = ((math.abs(random.nextInt) % ('Z' -
    'A')).toChar + 'A').toChar

    private def randDigit : Char = (math.abs(random.nextInt % 10) + '0').toChar

    private def newName = (Seq.fill(2)(randLetter) ++ Seq.fill(3)(randDigit)).mkString
    
    private var realName = newName

    def name = realName 

    def reset() = {
        realName = newName 
    }
}
