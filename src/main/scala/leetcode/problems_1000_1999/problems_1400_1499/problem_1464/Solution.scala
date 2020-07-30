package leetcode.problems_1000_1999.problems_1400_1499.problem_1464

object Solution {
  def maxProduct(nums: Array[Int]): Int = {
    var max = 0
    for (i <- 0 until nums.length - 1) {
      for (j <- i + 1 until nums.length) {
        if ((nums(i) - 1) * (nums(j) - 1) > max) {
          max = (nums(i) - 1) * (nums(j) - 1)
        }
      }
    }
    max
  }

  def main(args: Array[String]): Unit = {

    print(maxProduct(Array(3, 4, 5, 2)))
  }
}
