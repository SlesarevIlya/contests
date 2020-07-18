package codeforces.div2605._1

object Solution {
  import scala.io.StdIn.readLine

  def getResult(n: Int, a: Int, x: Int, b: Int, y: Int): String = {
    var state1 = a
    var state2 = b

    while (state1 != x && state2 != y) {
      if (state1 != n) state1 += 1 else state1 = 1
      if (state2 != 1) state2 -= 1 else state2 = n

      if (state1 == state2) return "YES"
    }

    "NO"
  }

  def main(args: Array[String]): Unit = {
    var Array(n, a, x, b, y) = readLine.split(" ").map(_.toInt)
    println(getResult(n, a, x, b, y))
  }
}
