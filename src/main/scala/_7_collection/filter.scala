package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runFilter(): Unit = {
  val myNums: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

  val myOddNums = myNums.filter(num => num % 2 != 0)

  println(myOddNums)
}
