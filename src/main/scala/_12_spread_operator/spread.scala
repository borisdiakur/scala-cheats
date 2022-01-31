package _12_spread_operator

def myFun[T](vargs: T*): Unit = {
  println(vargs.head)
  println(vargs.tail)
  println(vargs.last)
}

@main def runSpread(): Unit = {
  val mySeq = Seq(1, 2, 3)
  myFun(mySeq: _*)
}
