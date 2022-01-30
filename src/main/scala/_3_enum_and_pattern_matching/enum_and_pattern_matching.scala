package _3_enum_and_pattern_matching

@main def runEnumAndPatternMatching(): Unit = {
  enum Sex {
    case Male, Female
  }

  val mySex =
    if ((new scala.util.Random).nextBoolean()) Sex.Male else Sex.Female

  mySex match {
    case Sex.Male   => println("I'm man! Make fire!")
    case Sex.Female => println("I'm woman! Make kids!")
  }
}
