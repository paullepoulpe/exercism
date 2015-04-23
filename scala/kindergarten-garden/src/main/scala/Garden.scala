object Garden {
    private val children = Seq("Alice", "Bob", "Charlie", "David", "Eve",
    "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry")

    def defaultGarden(diagram : String) = Garden(children, diagram)

}

case class Garden(_children : Seq[String], diagram : String){
    
    val children =_children.sorted

    private def pos(name: String) = children.indexOf(name)
    
    private val split = diagram.split("\n").toSeq

    private def get2[T](s : Seq[T], idx: Int) = s grouped 2 toList idx

    private def getInitials(name : String) = if(pos(name) < 0) Nil else split.flatMap(get2(_, pos(name)))  

    def getPlants(name: String) = getInitials(name).flatMap(i => Plant.values.find(_.toString.head == i))
}

object Plant extends Enumeration {
    type Plant = Value
    val Radishes, Grass, Clover, Violets = Value
}
