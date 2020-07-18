package leetcode._771_Jewels_and_stones_easy

object Solution extends App {
  import scala.collection.mutable.HashSet

  def numJewelsInStones(J: String, S: String): Int = {
    val hm: HashSet[Char] = new HashSet()
    for (ch <- J) {
      hm.add(ch)
    }

    var counter: Int = 0
    for (ch <- S) {
      if (hm.contains(ch)) {
        counter += 1
      }
    }

    counter
  }

  var J = "aA"
  var S = "aAAbbbb"
  println(numJewelsInStones(J, S))
}
