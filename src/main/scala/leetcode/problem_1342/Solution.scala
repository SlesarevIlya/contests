package leetcode.problem_1342

object Solution {

  def numberOfSteps (num: Int): Int = {
    def steps(num: Int, count: Int): Int = {
      num match {
        case 0 => count
        case even if even % 2 == 0 => steps(even / 2, count+1)
        case odd if odd % 2 == 1 => steps(odd - 1, count+1)
      }
    }

    steps(num, 0)
  }

  def main(args: Array[String]): Unit = {
    print(numberOfSteps(123))
  }

}
