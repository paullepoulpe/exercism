case class CryptoSquare(){
    import math._
    import scala.language._

    implicit private def string2inst(s: String) = CryptoSquareInst(s)

    case class CryptoSquareInst(s : String) {
        
        lazy val plain = s filter (c => c.isLetter || c.isDigit) map (_.toLower)

        lazy val squareLen = ceil(sqrt(plain.length)).toInt

        lazy val segments = (plain grouped squareLen).toList

        private def column(idx : Int) = segments.flatMap(_.lift(idx - 1)) mkString

        lazy val cipher = normalized filterNot (_.isWhitespace)

        lazy val normalized = (1 to squareLen) map column mkString " "
    }
    
    def normalizePlaintext(s: String) = s plain

    def squareSize(s : String) = s squareLen
    
    def plaintextSegments(s : String) = s segments
    
    def ciphertext(s : String) = s cipher
    
    def normalizedCiphertext(s : String) = s normalized

}
