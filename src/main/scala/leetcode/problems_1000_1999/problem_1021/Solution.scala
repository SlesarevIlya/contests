package leetcode.problems_1000_1999.problem_1021

object Solution {
  def removeOuterParentheses(S: String): String = {
    var count = 0
    var start = 1
    var result = ""
    for (i <- 0 until S.length) {
      if (S(i) == '(') {
        count += 1
      } else {
        count -= 1
      }

      if (count == 0) {
        result += S.substring(start, i)
        start = i + 2
      }
    }

    result
  }

  def main(args: Array[String]): Unit = {
    print(removeOuterParentheses("(()())(())(()(()))"))
  }
}
