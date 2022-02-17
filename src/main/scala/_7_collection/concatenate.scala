package _7_collection

@main def runConcatenate(): Unit = {
  val a = Iterable('a', 'b')
  val b = Seq('c', 'd')
  val c = Set('e', 'e')

  println(b ++ a ++ c)
}
