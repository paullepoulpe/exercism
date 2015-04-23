case class Binary(s: String){
    def toDecimal = s.foldLeft[Option[Int]](Some(0)){
        case (Some(b), '1') => Some(b * 2 + 1)
        case (Some(b), '0') => Some(b * 2)
        case _ => None
    }.getOrElse(0)
}
