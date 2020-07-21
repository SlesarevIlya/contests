package leetcode.problems_0_999.problems_0_99.problem_09

object Solution extends App {
  def isPalindrome(x: Int): Boolean = {
    var number: Int = x
    var reverseNumber: String = ""
    var result = false
    if (x >= 0) {
      while (number != 0) {
        reverseNumber += Math.abs(number % 10)
        number /= 10
      }
      if (reverseNumber == "" || reverseNumber == x.toString) {
        result = true
      }
    }

    result
  }

  print(isPalindrome(0))
}
