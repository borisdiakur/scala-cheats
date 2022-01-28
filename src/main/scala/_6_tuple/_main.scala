package _6_tuple

@main def runTouple(): Unit = {
  val myTuple: (Int, String, String, Double) = (123456, "Max", "Mustermann", 2.34)

  println(s"$myTuple")
  println(s"${myTuple._2}")
}
