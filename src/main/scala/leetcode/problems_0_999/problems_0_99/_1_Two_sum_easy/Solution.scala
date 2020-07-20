package leetcode.problems_0_999.problems_0_99._1_Two_sum_easy

object Solution{
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val filteredNums = nums.filter(_ <= target)

    for (i <- filteredNums.indices) {
      for (j <- i + 1 until filteredNums.length) {
        if (filteredNums(i) + filteredNums(j) == target) {
          return findIndex(nums, Array(filteredNums(i), filteredNums(j)))
        }
      }
    }

    Array()
  }

  def findIndex(nums: Array[Int], result: Array[Int]): Array[Int] = {
    val output = scala.collection.mutable.ArrayBuffer.empty[Int]
    for (i <- nums.indices) {
      if (nums(i) == result(0) || nums(i) == result(1)) {
        output += i
      }
    }

    output.toArray
  }

  def main(args: Array[String]): Unit = {
    print(twoSum(Array(0, 4, 3, 0), 0).mkString(", "))
  }
}