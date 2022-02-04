package _19_trait

trait CanBark {
  def bark: String = "Wau!"
}

trait CanHowl {
  def howl: String = "Awooo!"
}

class Dog extends CanBark {
  private var totalSticksCollected: Int = 0

  override def bark: String = "Wuff!"

  def collectStick(): Unit = totalSticksCollected += 1
}

class Wolf extends CanBark, CanHowl // ⚠️ Multi-inheritance! Doesn't work with classes! ⚠️

@main def runTrait(): Unit = {
  val dog: CanBark = Dog()
  println(dog.bark)
  // dog.collectStick() // ⚠️ cannot collect stick because type is CanBark ⚠️

  val wolf = Wolf()
  println(wolf.bark)
  println(wolf.howl)
}
