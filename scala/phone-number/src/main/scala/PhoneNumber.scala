class PhoneNumber(s: String){
   
    val invalid = Seq.fill(10)('0').mkString

    val clean = s.filter(_.isDigit)

    val rmHead = if(clean.length == 11 && clean(0) == '1') clean.tail else clean 

    val number : String = if(rmHead.length == 10) rmHead else invalid

    val areaCode : String = number.take(3)

    override val toString = {
        val part1 = areaCode
        val part2 = number.substring(3, 6)
        val part3 = number.substring(6)

        s"($part1) $part2-$part3"
    }
}
