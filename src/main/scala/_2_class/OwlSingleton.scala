package _2_class

object OwlSingleton {
  val age: String = "old"
  def sayUhuh(): Unit = println("Uhuh!")
}

@main def runOwlSingleton(): Unit = {
  OwlSingleton.sayUhuh()
}
