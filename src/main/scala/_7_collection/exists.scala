package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runExists(): Unit = {
  val myNums: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

  val evenExists = myNums.exists(num => num % 2 == 0)

  println(evenExists)
}
