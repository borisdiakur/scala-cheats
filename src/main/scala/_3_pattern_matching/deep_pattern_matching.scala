package _3_pattern_matching

@main def runDeepPatternMatching(): Unit = {
  def checkOption(arg: Option[String]): String = arg match {
    case Some(name) => s"That cat's name is $name."
    case None       => "What cat?"
  }

  println(checkOption(Some("Mochi")))
  println(checkOption(None))
}
