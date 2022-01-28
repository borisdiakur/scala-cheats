package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runFlatten(): Unit = {
  val myNums1: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)
  val myNums2: ArrayBuffer[Int] = ArrayBuffer(4, 5, 6)

  println(ArrayBuffer(myNums1, myNums2).flatten)
}
