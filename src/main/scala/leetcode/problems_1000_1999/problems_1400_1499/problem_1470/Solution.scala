package leetcode.problems_1000_1999.problems_1400_1499.problem_1470

object Solution {
  import scala.collection.mutable.ArrayBuffer
  def shuffle(nums: Array[Int], n: Int): Array[Int] = {
    var result = ArrayBuffer.empty[Int]

    for (i <- 0 until n) {
      result += nums(i)
      result += nums(i + n)
    }

    result.toArray
  }

  def main(args: Array[String]) = {
    print(shuffle(Array(2,5,1,3,4,7), 3).mkString(","))
  }
}
