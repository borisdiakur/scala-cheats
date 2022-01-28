package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runReduce(): Unit = {
  val myNums: ArrayBuffer[Int] = ArrayBuffer(1, 5, 3, 7, 4, 2)

  // ⚠️ no guarantee for order of execution ⚠️
  val largestNum: Int = myNums.reduce((a, b) => if (a > b) a else b)

  println(largestNum)
}
