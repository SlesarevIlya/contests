package projectEuler

object task1 extends App {

  val start = 0
  val end = 1000
  var sum = 0
  for (i <- start until end) {
    if (i.%(3) == 0 || i.%(5) == 0) sum += i
  }

  println(sum)
}