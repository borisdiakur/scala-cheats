package _7_collection

@main def runConcatenate(): Unit = {
  val a = Iterable('a', 'b')
  val b = Seq('c', 'd')

  println(b ++ a)
}
