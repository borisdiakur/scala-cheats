package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runMap(): Unit = {
  val myNums: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

  val myNumsPlus1 = myNums.map(num => num + 1)

  println(myNumsPlus1)
}
