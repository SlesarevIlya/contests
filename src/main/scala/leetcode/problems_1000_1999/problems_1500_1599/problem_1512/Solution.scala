package leetcode.problems_1000_1999.problems_1500_1599.problem_1512

object Solution {
  def numIdenticalPairs(nums: Array[Int]): Int = {
    var pairs = 0
    for (i <- nums.indices) {
      for (j <- i + 1 until nums.length) {
        if (nums(i) == nums(j)) {
          pairs += 1
        }
      }
    }

    pairs
  }

  def main(args: Array[String]): Unit = {
    print(numIdenticalPairs(Array(1,2,3,1,1,3)))
  }

}
