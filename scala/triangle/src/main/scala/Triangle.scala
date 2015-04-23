object TriangleType extends Enumeration {
    type TriangleType = Value
    val Equilateral, Isosceles, Scalene, Illogical = Value
}

case class Triangle(_a : Int, _b: Int, _c: Int){
    import TriangleType._
    private val List(a, b, c) = List(_a, _b, _c).sorted

    private val hasPosSides = a > 0 
    private val isTriangle = hasPosSides && a + b > c 
    private val isEquilateral = isTriangle && a == c
    private val isIsosceles = isTriangle && (a == b || b == c) 

    def triangleType =
        if(!isTriangle) Illogical
        else if(isEquilateral) Equilateral
        else if(isIsosceles) Isosceles
        else Scalene
}
