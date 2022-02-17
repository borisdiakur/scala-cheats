package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runFlatMap(): Unit = {
  val myNums1: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)
  val myNums2: ArrayBuffer[Int] = ArrayBuffer(4, 5, 6)

  val allNumsPlus1 = ArrayBuffer(myNums1, myNums2)
    .flatMap(nums => nums.map(num => num + 1))

  // same as with flatten + map  ╮( ˘_˘ )╭
  val allNumsPlus2 = ArrayBuffer(myNums1, myNums2).flatten
    .map(num => num + 1)

  println(allNumsPlus1)
  println(allNumsPlus2)
}
