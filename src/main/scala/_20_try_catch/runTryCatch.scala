package _20_try_catch

@main def runTryCatch(): Unit = {

  def devideBy(a: Int, b: Int): Int = {
    try {
      a / b
    } catch {
      case e: ArithmeticException => 42
    }
  }

  println(devideBy(4, 4))
  println(devideBy(4, 3))
  println(devideBy(4, 2))
  println(devideBy(4, 1))
  println(devideBy(4, 0))
}
