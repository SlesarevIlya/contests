package leetcode.problems_0_999.problems_0_99.problem_07

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
