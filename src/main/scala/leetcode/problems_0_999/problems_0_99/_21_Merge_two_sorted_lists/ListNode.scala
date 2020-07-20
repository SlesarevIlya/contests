package leetcode.problems_0_999.problems_0_99._21_Merge_two_sorted_lists

class ListNode(var _x: Int = 0) {
  var next: ListNode = _
  var x: Int = _x

  override def toString: _root_.java.lang.String = {
    var result = "[" + this.x.toString
    var iterator = this.next
    while (iterator != null) {
      result = result + ", " + iterator.x
      iterator = iterator.next
    }

    result + "]"
  }
}
