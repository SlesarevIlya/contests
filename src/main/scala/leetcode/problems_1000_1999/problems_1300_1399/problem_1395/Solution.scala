package leetcode.problems_1000_1999.problems_1300_1399.problem_1395

object Solution {

  def numTeams(rating: Array[Int]): Int = {
    var teamCounter = 0
    for (i <- 0 until rating.length - 2) {
      for (j <- i + 1 until rating.length - 1) {
        for (k <- j + 1 until rating.length) {
          if (rating(i) > rating(j) && rating(j) > rating(k) ||
            rating(i) < rating(j) && rating(j) < rating(k)) {
              teamCounter += 1
              print(rating(i) + " " + rating(j) + " " + rating(k) + "\n")
          }
        }
      }
    }
    teamCounter
  }

  def main(args: Array[String]): Unit = {
    print(numTeams(Array(3, 6, 7, 5, 1)))
  }
}
