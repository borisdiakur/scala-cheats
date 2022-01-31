package _7_collection

@main def runCurrying(): Unit = {

  def mySum = (a: Int, b: Int) => a + b

  def mySumCur = (a: Int) => (b: Int) => a + b

  def mySumWith3 = mySumCur(3)

  println(mySumWith3(4))
  println(mySumWith3(7))
}
