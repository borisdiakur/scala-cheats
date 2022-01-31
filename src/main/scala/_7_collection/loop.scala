package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runLoop(): Unit = {
  val myNums: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

  for (i <- myNums.indices) {
    print(myNums(i))
  }
  println()

  for (num <- myNums) {
    print(num)
  }
  println()

  for (i <- 1 until myNums.length + 1) {
    print(myNums(i - 1))
  }
  println()

  myNums.foreach(num => print(num))
  println()

  val toPrint = for (num <- myNums) yield num.toString
  println(toPrint(0) + toPrint(1) + toPrint(2))
}
