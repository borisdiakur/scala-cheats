package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runForall(): Unit = {
  val myNums: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

  val allOdd = myNums.forall(num => num % 2 != 0)

  println(allOdd)
}
