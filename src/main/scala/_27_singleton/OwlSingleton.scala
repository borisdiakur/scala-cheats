package _27_singleton

object OwlSingleton {
  val age: String | Int = "so"
  def sayUhuh(): Unit = println(s"Uhuh! I'm $age old.")
}

@main def runOwlSingleton(): Unit = {
  OwlSingleton.sayUhuh()
}
