class Anagram(s : String) {

    val lowerCase = s.toLowerCase
    val sorted = lowerCase.sorted
   
    def isAnagram(word : String) = {
        val lowerWord = word.toLowerCase
        lowerWord.sorted == sorted && lowerCase != lowerWord
    }

    def matches(list : Seq[String]) = list.filter(isAnagram )

}
