package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runExists(): Unit = {
  val myNums: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)
  println(myNums.exists(num => num % 2 == 0)) // exists checks values (in O(n))
  println(myNums.contains(2)) // contains checks hash code (in O(1))

  val myMap = Map('a' -> 'A', 'b' -> 'B')
  println(myMap.exists(el => el._1 == 'a')) // exists checks values (in O(n))
  println(myMap.contains('a')) // contains checks hash code (in O(1))
}
