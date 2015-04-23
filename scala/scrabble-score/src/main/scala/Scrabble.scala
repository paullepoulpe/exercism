object Scrabble {
    val LettersValue = Map(
        "AEIOULNRST" -> 1,
        "DG" -> 2,
        "BCMP" -> 3,
        "FHVWY" -> 4,
        "K" -> 5,
        "JX" -> 8,
        "QZ" -> 10)

    val LetterValue = LettersValue.flatMap{ case (b, a) => b.map(_ -> a) }
}
class Scrabble {
    import Scrabble._

   def scoreLetter(letter: Char) : Int = LetterValue(letter.toUpper)
   def scoreWord(word: String) : Int = word.map(scoreLetter).sum
}
