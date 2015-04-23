case class Allergies() {
    import Allergen._

    def allergies(num : Int) = values.filter(a => isAllergicTo(a, num)).toList
    
    def isAllergicTo(a : Allergen.Value, num : Int) = (num & (1 << a.id)) != 0
}

object Allergen extends Enumeration {
    type Allergen = Value
    val Eggs = Value(0)
    val Peanuts = Value(1)
    val Shellfish = Value(2)
    val Strawberries = Value(3)
    val Tomatoes = Value(4) 
    val Chocolate = Value(5)
    val Pollen = Value(6)
    val Cats = Value(7)
}
