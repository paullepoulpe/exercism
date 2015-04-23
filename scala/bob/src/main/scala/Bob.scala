
class Bob{

    def isShout(s : String) = s.exists(_.isUpper) && s.forall(c => !c.isLetter || c.isUpper)

    def isSilence(s: String) = s.length == 0 || s.forall(_.isWhitespace)
    def hey(s: String) : String = s match {
        case a if isShout(a) => "Whoa, chill out!"
        case a if a.endsWith("?") => "Sure."
        case a if isSilence(s) => "Fine. Be that way!"
        case _ => "Whatever."
    }

}
