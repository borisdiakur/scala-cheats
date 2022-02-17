package _9_map

import scala.collection.immutable
import scala.collection.mutable

@main def runMap(): Unit = {
  val myEmptyMap = immutable.Map()
  println(myEmptyMap)

  val myMap = immutable.Map('a' -> 'A', 'b' -> 'B')
  println(myMap)

  // removing
  println(myMap.removed('a'))

  // adding
  println(myMap ++ Map('c' -> 'C'))

  // checking for existance
  println(myMap.contains('a'))
  println(myMap.exists((key, value) => value == 'A'))

  // getting
  println(myMap.getOrElse('a', throw new IllegalAccessError("nope")))

  val myMutMap: mutable.HashMap[Char, Char] = mutable.HashMap()
  myMutMap.addOne('c' -> 'C')
}
