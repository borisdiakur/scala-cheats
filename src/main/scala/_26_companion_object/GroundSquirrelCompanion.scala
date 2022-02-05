package _26_companion_object

class GroundSquirrelCompanion(private val name: String) {
  GroundSquirrelCompanion.totalSquirrels += 1

  println(s"I'm $name. I'm number ${GroundSquirrelCompanion.totalSquirrels}.")
}

object GroundSquirrelCompanion {
  private var totalSquirrels = 0
}

@main def runCompanion(): Unit = {
  val chip = GroundSquirrelCompanion("Chip")
  val chap = GroundSquirrelCompanion("Chap")
}
