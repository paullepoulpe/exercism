import org.scalatest._

class RomanNumeralsSpecs extends FunSpec with Matchers {

  it ("0 equals empty string") {
    RomanNumeral(0).value should be ("")
  }

  val testcases = Map(
    1 -> "I",
    2 -> "II",
    3 -> "III",
    4 -> "IV",
    5 -> "V",
    6 -> "VI",
    9 -> "IX",
    27 -> "XXVII",
    48 -> "XLVIII",
    59 -> "LIX",
    93 -> "XCIII",
    93 -> "XCIII",
    141 -> "CXLI",
    402 -> "CDII",
    575 -> "DLXXV",
    911 -> "CMXI",
    1024 -> "MXXIV",
    3000 -> "MMM")

  for((input, output) <- testcases){
    it (s"$input equals $output") {
        RomanNumeral(input).value should be(output)
    }
  }

}
