package leetcode.problems_1000_1999.problems_1200_1299.problem_1221

object Solution {

  def balancedStringSplit(s: String): Int = {
    var separator, sum = 0
    for (letter <- s) {
      separator = if (letter.equals('R')) separator + 1 else separator - 1
      if (separator == 0)
        sum += 1
    }

    sum
  }

  def main(args: Array[String]): Unit = {
    print(balancedStringSplit("RLRRLLRLRL"))
  }
}
