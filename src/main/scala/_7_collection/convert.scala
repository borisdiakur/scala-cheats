package _7_collection

@main def runConvert(): Unit = {
  // get list of types
  // List -> Map -> Set -> List
  val mySeq = List((Int, 'a'), (Int, 'b'), (Double, 'c'))
  println(mySeq.toMap.keys.toSeq)
}
