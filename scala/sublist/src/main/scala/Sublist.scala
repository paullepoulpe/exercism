object Sublist extends Enumeration {
    type Sublist = Value
    val Sublist, Unequal, Equal, Superlist = Value
}

class Sublist {
    def sublist[T](xx : List[T], yy : List[T]) : Sublist.Value = { 
        val sup = xx.containsSlice(yy) 
        val sub = yy.containsSlice(xx) 

        (sup, sub) match {
            case (true, true) => Sublist.Equal
            case (true, false) => Sublist.Superlist
            case (false, true) => Sublist.Sublist
            case (false, false) => Sublist.Unequal
        }
    }
}
