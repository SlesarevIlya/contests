package leetcode.problems_1000_1999.problems_1500_1599.problem_1512

object Solution2 {
  import scala.util.Sorting.quickSort
  def numIdenticalPairs(nums: Array[Int]): Int = {
    quickSort(nums)
    var pairs = 0
    var j = 0
    for (i <- 1 until nums.length) {
      if (nums(i) == nums(j)) {
        pairs += i - j
      } else {
        j = i
      }
    }

    pairs
  }

  def main(args: Array[String]): Unit = {
    print(numIdenticalPairs(Array(1,2,3,1,1,3)))
  }
}
