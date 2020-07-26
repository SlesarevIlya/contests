package leetcode.problems_1000_1999.problems_1200_1299.problem_1295

object Solution {
  def findNumbers(nums: Array[Int]): Int = {
    nums.count(_.toString.length % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    print(findNumbers(Array(12,345,2,6,7896)))
  }

}
