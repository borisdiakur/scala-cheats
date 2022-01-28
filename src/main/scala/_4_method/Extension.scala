package _4_method

class Extension(var totalNumberOfThings: Int) {}

extension (i: Int) {
  def +(that: Extension): Int =
    i + that.totalNumberOfThings
}

@main def runExtension(): Unit = {
  val myExtension = new Extension(7)
  println(s"${5 + myExtension}")
}
