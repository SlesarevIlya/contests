package leetcode.problems_1000_1999.problems_1200_1299.problem_1252

object Solution {
  def oddCells(n: Int, m: Int, indices: Array[Array[Int]]): Int = {
    val result = Array.ofDim[Int](n, m)
    for (el <- indices) {
      for (i <- 0 until m) {
        result(el(0))(i) += 1
      }
      for (i <- 0 until n) {
        result(i)(el(1)) += 1
      }
    }
    result.flatten.foldLeft(0)((acc, x) => if (x % 2 == 1) acc + 1 else acc)
  }


  def main(args: Array[String]): Unit = {
    print(oddCells(2, 3, Array(Array(0, 1), Array(1, 1))))
  }

}
