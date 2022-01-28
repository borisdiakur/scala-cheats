package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runZip(): Unit = {
  val myNums1: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)
  val myNums2: ArrayBuffer[Int] = ArrayBuffer(4, 5, 6, 7, 8)

  val zipped = myNums1.zip(myNums2)

  println(zipped)
}
