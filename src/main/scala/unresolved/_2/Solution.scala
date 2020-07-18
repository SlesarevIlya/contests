package unresolved._2

object Solution extends App {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {

    var firstIterator = l1
    var secondIterator = l2
    var resultListNode = new ListNode(l1._x + l2._x)
    var tmpListNode =

    while (firstIterator.next != null && secondIterator.next != null) {
      firstIterator = firstIterator.next
      secondIterator = secondIterator.next
    }
    new ListNode(1)
  }

  // == 342
  val firstNumber = new ListNode(2)
  firstNumber.next = new ListNode(4)
  firstNumber.next.next = new ListNode(3)

  // == 456
  val secondNumber = new ListNode(6)
  secondNumber.next = new ListNode(5)
  secondNumber.next.next = new ListNode(4)

  print(firstNumber)
}
