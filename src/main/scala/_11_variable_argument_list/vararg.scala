package _11_variable_argument_list

def myFun[T](vargs: T*): Unit = {
  // vargs is of type ArraySeq
  println(vargs.head)
  println(vargs.tail)
  println(vargs.last)
}

@main def runVararg(): Unit = {
  myFun[Int](1, 2, 3)
}
