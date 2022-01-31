package _11_variable_argument_list

def myFun[T](vargs: T*): Unit = {
  println(vargs.head)
  println(vargs.tail)
  println(vargs.last)
}

@main def runVararg(): Unit = {
  myFun(1, 2, 3)
}
