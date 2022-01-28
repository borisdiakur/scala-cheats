package _4_method

@main def main(): Unit = {
  val myOperation = new Operation(7)
  println(s"${myOperation + 3}")

  val myExtension = new Extension(7)
  println(s"${5 + myExtension}")
}
