case class Squares() {
    
    private def square(x: Int) = x * x

    def sumOfSquares(a: Int) = (a * (a + 1) * (2 * a + 1)) / 6

    def squareOfSums(a: Int) = square((a * (a + 1)) / 2)
    
    def difference(a : Int) = squareOfSums(a) - sumOfSquares(a)
}
