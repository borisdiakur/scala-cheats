package _7_collection

@main def runConvert(): Unit = {
  // get list of types
  // List -> Map -> Set / Iterable -> List
  val mySeq = List((3, 'a'), (4, 'b'), (5, 'c'))
  println(mySeq)
  println(mySeq.toMap)
  println(mySeq.toMap.keys)
  println(mySeq.toMap.values)
  println(mySeq.toMap.keys.toSeq)
  println(mySeq.toMap.values.toSeq)
}
