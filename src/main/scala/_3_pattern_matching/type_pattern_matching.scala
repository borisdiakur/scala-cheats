package _3_pattern_matching

@main def runTypePatternMatching(): Unit = {
  val sex = Map(0 -> "Female", 1 -> "Male", 2 -> 'Q')

  val mySex = if ((new scala.util.Random).nextBoolean()) sex.get(0) else sex.get(1)

  mySex match {
    case Some(sex: String) =>
      if (sex == "Female") {
        println("I'm woman! Make kids!")
      } else {
        println("I'm man! Make fire!")
      }
    case Some(_) => println("???")
    case None    => throw new IllegalArgumentException("WAT?")
  }
}
