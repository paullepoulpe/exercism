class Phrase(s : String){
    val map = Map.empty[String, Int].withDefaultValue(0)
    
    val words = s.toLowerCase.split("[^\\w']+")

    val wordCount = (map /: words){
        (m, word) => m + (word  -> (m(word) + 1))
    }

}
