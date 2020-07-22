package leetcode.problems_1000_1999.problems_1400_1499.problem_1431

object Solution {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    candies.map(_ + extraCandies >= candies.max)
  }

  def main(args: Array[String]) = {

    print(kidsWithCandies(Array(2,3,5,1,3), 3).mkString(","))
  }

}
