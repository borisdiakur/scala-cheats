package _4_method

class Operation(var totalNumberOfThings: Int) {
  def +(summand: Int): Int = totalNumberOfThings + summand
}

@main def runOperation(): Unit = {
  val myOperation = new Operation(7)
  println(s"${myOperation + 3}")
}
