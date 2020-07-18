package leetcode.problems_0_1000.problems_0_99._7_Reverse_integer_easy

object Solution extends App {
  def reverse(x: Int): Int = {
    var number: Int = x
    var result: String = ""
    if (x < 0) {
      result += "-"
    }
    while (number != 0) {
      result += Math.abs(number % 10)
      number /= 10
    }
    if (result == "" || result.toDouble > Integer.MAX_VALUE || result.toDouble < Integer.MIN_VALUE) {
      0
    } else {
      result.toInt
    }
  }

  println(reverse(-123))
}
