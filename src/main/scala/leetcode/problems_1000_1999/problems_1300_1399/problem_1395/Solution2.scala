package leetcode.problems_1000_1999.problems_1300_1399.problem_1395

object Solution2 {

  def numTeams(rating: Array[Int]): Int = {
    var teamCounter = 0

    for (i <- 1 until rating.length) {
      val less, greater = Array(0, 0)
      for (j <- 0 until i) {
        if (rating(j) < rating(i))
          less(0) += 1
        else
          greater(0) += 1
      }

      for (j <- i + 1 until rating.length) {
        if (rating(j) > rating(i))
          less(1) += 1
        else
          greater(1) += 1
      }
      teamCounter += less.product + greater.product
    }
    teamCounter
  }

  def main(args: Array[String]): Unit = {
    print(numTeams(Array(2, 5, 3, 4, 1)))
  }
}
