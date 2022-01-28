package _7_collection

import scala.collection.mutable.ArrayBuffer

@main def runFoldLeft(): Unit = {
  val myLetters: ArrayBuffer[String] = ArrayBuffer("a", "b", "c")

  val concatenated: String = myLetters.foldLeft("")((a, b) => a + b)

  println(concatenated)
}
