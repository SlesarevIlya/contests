package leetcode.problems_0_999.problems_0_99.problem_21

object Solution extends App {
  def mergeTwoLists(externalL1: ListNode, externalL2: ListNode): ListNode = {
    if (externalL1 == null) {
      return externalL2
    } else if (externalL2 == null) {
      return externalL1
    }
    var l1: ListNode = externalL1
    var l2: ListNode = externalL2
    var tmp: ListNode = new ListNode(Math.min(l1.x, l2.x))

    if (l1.x <= l2.x) {
      l1 = l1.next
    } else {
      l2 = l2.next
    }

    val result: ListNode = tmp
    while (l1 != null || l2 != null) {
      if (l1 != null && l2 != null) {
        if (l1.x <= l2.x) {
          tmp.next = new ListNode(l1.x)
          l1 = l1.next
        } else {
          tmp.next = new ListNode(l2.x)
          l2 = l2.next
        }
        tmp = tmp.next
      } else if (l1 != null) {
        tmp.next = l1
        l1 = null
      } else if (l2 != null) {
        tmp.next = l2
        l2 = null
      }
    }

    result
  }

  val firstNumber = new ListNode(1)
  firstNumber.next = new ListNode(2)
  firstNumber.next.next = new ListNode(4)

  val secondNumber = new ListNode(1)
  secondNumber.next = new ListNode(3)
  secondNumber.next.next = new ListNode(4)

  println(mergeTwoLists(firstNumber, secondNumber))
}
