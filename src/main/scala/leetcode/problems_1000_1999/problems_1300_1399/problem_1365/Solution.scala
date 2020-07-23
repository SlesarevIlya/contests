package leetcode.problems_1000_1999.problems_1300_1399.problem_1365

object Solution {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    nums.map(p => nums.count(q => q < p))
  }

  def main(args: Array[String]): Unit = {
    print(smallerNumbersThanCurrent(Array(8,1,2,2,3)).mkString(","))
  }
}