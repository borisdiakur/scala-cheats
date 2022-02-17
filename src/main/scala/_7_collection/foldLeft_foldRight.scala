package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runFoldLeft(): Unit = {
  val myNums: ArrayBuffer[Double] = ArrayBuffer(3.0, 4.0)

  val foldedLeft: Double = myNums.foldLeft(2.0)((a, b) => Math.pow(a, b))
  println(foldedLeft) // (2 ^ 3) ^ 4

  val foldedRight: Double = myNums.foldRight(2.0)((a, b) => Math.pow(a, b))
  println(foldedRight) // 3 ^ (4 ^ 2)
}
