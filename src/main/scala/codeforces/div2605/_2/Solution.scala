

import scala.collection.mutable

object Solution extends App {
  import collection.mutable.HashMap
  import scala.io.StdIn.readLine

  def checkPair(a: Int, b: Int, pairs: Array[(Int, Int)]): Boolean = {
    var result = true
    for ((x, y) <- pairs) {
      if (a != x && b != x && a != y && b != y) result = false
    }

    result
  }

  var Array(n, m) = readLine.split(" ").map(_.toInt)
  var numbersSet = Set[Int]()
  val setUsage = new mutable.HashMap[Int,Set[Int]]()
  for (el <- 0 until m) {
    val tmpArr = readLine.split(" ").map(_.toInt)
    setUsage(tmpArr(0) - 1) += el
    setUsage(tmpArr(1) - 1) += el
  }

  var result = "NO"
  /*
    for (i <- 0 until setUsage.length - 1) {
      for (j <- 1 until setUsage.length) {
        if ((setUsage(i) ++ setUsage(j)).size == m) {
          result = "YES"
        }
  //      println(setUsage(i) ++ setUsage(j))
  //      println((setUsage(i) ++ setUsage(j)).size)
      }
    }

    println(result)*/
}
