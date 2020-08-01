package leetcode.weekly.august.week_1

object Solution {
  def detectCapitalUse(word: String): Boolean = {
    var result = true
    if (word.length != 1) {
      if (word(1).isUpper & word(0).isUpper) {
        for (i <- 1 until word.length) {
          if (word(i).isLower) {
            result = false
          }
        }
      } else if (word(1).isLower) {
        for (i <- 1 until word.length) {
          if (word(i).isUpper) {
            result = false
          }
        }
      } else {
        result = false
      }
    }

    result
  }

  def main(args: Array[String]): Unit = {
    print(detectCapitalUse("qQ"))
  }

}
