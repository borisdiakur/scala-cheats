package _21_option_some_none

@main def runOption(): Unit = {
  case class Cat(name: String)

  val catMap = Map(0 -> Cat("Mochi"), 1 -> Cat("Kimchi"))

  def getRandomCatName: Option[String] = {
    val randomKey = (new scala.util.Random).nextInt(3)
    catMap.get(randomKey) match {
      case Some(cat: Cat) => Some(cat.name)
      case None           => None
    }
  }

  println(getRandomCatName)
  println(getRandomCatName)
  println(getRandomCatName)
  println(getRandomCatName)
  println(getRandomCatName)
  println(getRandomCatName)
  println(getRandomCatName)
  println(getRandomCatName)
  println(getRandomCatName)
  println(getRandomCatName)
}
