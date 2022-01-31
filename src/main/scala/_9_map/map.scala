package _9_map

import scala.collection.mutable

@main def runMap(): Unit = {
  val myEmptyMap = Map()
  println(myEmptyMap)

  val myMap = Map('a' -> 'A', 'b' -> 'B')
  println(myMap)

  // removing
  println(myMap.removed('a'))

  // adding
  println(myMap ++ Map('c' -> 'C'))

  // getting
  println(myMap.getOrElse('a', throw new IllegalAccessError("nope")))

  val myMutMap = mutable.HashMap()
}
