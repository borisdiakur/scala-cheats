package _4_method

class Operation(var totalNumberOfThings: Int) {
  def +(summand: Int): Int = totalNumberOfThings + summand
  def unary_- : Int = -totalNumberOfThings
}

@main def runOperation(): Unit = {
  val myOperation = new Operation(7)
  println(s"${myOperation + 3}")
  println(s"${-myOperation}")
}
