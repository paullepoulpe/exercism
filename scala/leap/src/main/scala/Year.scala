case class Year(year : Int) {
    
    private def multiple(n : Int) = year % n == 0

    def isLeap = (multiple(4) && !multiple(100)) || multiple(400)
}
