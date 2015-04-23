import collection.immutable.SortedMap

class School {
    private var dataBase = SortedMap.empty[Int, Seq[String]].withDefaultValue(Seq())
    
    def db = dataBase
    
    def add(name: String, grade: Int) = {
        dataBase = db + (grade -> (db(grade) :+ name))
    }

    def sorted = db.map{ case (k, v) => (k, v.sorted) }

    def grade(g: Int) = db(g)
}
