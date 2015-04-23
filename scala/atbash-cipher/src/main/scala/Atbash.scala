case class Atbash(){

    private def encodeLetter(c : Char) = if(c.isDigit) c else ('a' + ('z' - c)).toChar

    private val preFormat = (_ : String) map (_.toLower) filter (c => c.isLetter || c.isDigit) 

    private val postFormat = (_ : String) grouped 5 map (_.mkString) mkString " "

    def encode =  preFormat andThen (_ map encodeLetter) andThen postFormat


}
