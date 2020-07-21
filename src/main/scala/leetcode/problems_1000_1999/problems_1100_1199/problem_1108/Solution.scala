package leetcode.problems_1000_1999.problems_1100_1199.problem_1108

object Solution {
  def defangIPaddr(address: String): String = {
    address.replace(".", "[.]")
  }

  def main(args: Array[String]) = {
    print(defangIPaddr("255.100.50.0"))
  }
}
