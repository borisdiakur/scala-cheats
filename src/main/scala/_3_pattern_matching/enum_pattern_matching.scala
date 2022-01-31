package _3_pattern_matching

@main def runEnumPatternMatching(): Unit = {
  enum Sex {
    case Male, Female
  }

  val mySex =
    if ((new scala.util.Random).nextBoolean()) Sex.Male else Sex.Female

  mySex match {
    case Sex.Male   => println("I'm man! Make fire!")
    case Sex.Female => println("I'm woman! Make kids!")
  }

  val whoHasSpoken: String = mySex match {
    case Sex.Male   => "Man"
    case Sex.Female => "Woman"
    // case _ => "Someone" // default case
  }

  println(s"$whoHasSpoken has spoken.")
}
