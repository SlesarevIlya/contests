package leetcode.problems_1000_1999.problems_1400_1499.problem_1480

object Solution {
  def runningSum(nums: Array[Int]) : Array[Int] = {
    var sum = 0
    nums.map(el => {
      sum += el
      sum
    })
  }

  def main(args: Array[String]): Unit = {
    print(runningSum(Array(1,2,3,4)).mkString(","))
  }
}
