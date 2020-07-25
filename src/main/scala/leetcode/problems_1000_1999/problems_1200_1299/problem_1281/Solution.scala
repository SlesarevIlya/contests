package leetcode.problems_1000_1999.problems_1200_1299.problem_1281

object Solution {
  def subtractProductAndSum(n: Int): Int = {
    var digit_array = n.toString.map(a => a.asDigit)
    digit_array.product - digit_array.sum
  }

  def main(args: Array[String]): Unit = {
    print(subtractProductAndSum(234))
  }
}
