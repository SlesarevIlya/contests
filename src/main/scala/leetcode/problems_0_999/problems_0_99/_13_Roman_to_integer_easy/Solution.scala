package leetcode.problems_0_999.problems_0_99._13_Roman_to_integer_easy

object Solution extends App {
  import scala.collection.mutable

  val ROMAN_DICTIONARY = mutable.HashMap(
    ('I', 1),
    ('V', 5),
    ('X', 10),
    ('L', 50),
    ('C', 100),
    ('D', 500),
    ('M', 1000)
  )

  def romanToInt(s: String): Int = {
    var result = 0
    var i = 0
    while (i < s.length) {
      if (i < s.length - 1 && ROMAN_DICTIONARY(s(i + 1)) > ROMAN_DICTIONARY(s(i))) {
        result += ROMAN_DICTIONARY(s(i + 1)) - ROMAN_DICTIONARY(s(i))
        i += 1
      } else {
        result += ROMAN_DICTIONARY(s(i))
      }

      i += 1
    }

    result
  }

  print(romanToInt("LVIII"))
}
