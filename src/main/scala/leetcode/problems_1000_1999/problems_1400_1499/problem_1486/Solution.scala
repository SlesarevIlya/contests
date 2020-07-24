package leetcode.problems_1000_1999.problems_1400_1499.problem_1486

object Solution {
  def xorOperation(n: Int, start: Int): Int = {
    var result = start
    for (i <- 1 until n) {
      result ^= start + i * 2
    }

    result
  }

  def main(args: Array[String]): Unit = {
    print(xorOperation(1,7 ))
  }
}
