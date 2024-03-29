package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runReduceOption(): Unit = {
  val emptyNums: ArrayBuffer[Int] = ArrayBuffer()

  // ⚠️ no guarantee for order of execution ⚠️
  val largestNum: Option[Int] = emptyNums.reduceOption((a, b) => if (a > b) a else b)

  println(largestNum.getOrElse(0))
}
