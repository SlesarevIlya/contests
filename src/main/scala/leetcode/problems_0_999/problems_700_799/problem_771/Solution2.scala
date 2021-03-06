package leetcode.problems_0_999.problems_700_799.problem_771

// solution with shifts
object Solution2 extends App {
  def numJewelsInStones(J: String, S: String): Int = {
    var p: Long = 0
    var sum: Long = 0
    for (i <- J) {
      p |= (1L << i - 65)
    }

    for (i <- S) {
      if ((p & 1L << i - 65) > 0) {
        sum += 1
      }
    }

    sum.toInt
  }

  var J = "aA"
  var S = "aAAbbbb"
  println(numJewelsInStones(J, S))
}
