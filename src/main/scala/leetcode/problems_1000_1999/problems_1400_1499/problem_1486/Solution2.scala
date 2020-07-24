package leetcode.problems_1000_1999.problems_1400_1499.problem_1486

object Solution2 {
  def xorOperation(n: Int, start: Int): Int = {
    (start until start + 2 * n by 2).reduce((x, y) => x^y)
  }

  def main(args: Array[String]): Unit = {
    print(xorOperation(10, 5))
  }
}
