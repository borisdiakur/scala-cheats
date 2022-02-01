package _14_comparison

enum Mammal extends Ordered[Mammal] {
  case Cat, Dog

  override def compare(that: Mammal): Int = {
    (this, that) match {
      case (Cat, Dog) => -1
      case (Dog, Cat) => 1
      case _          => throw new IllegalArgumentException("Comparison with incompatible type.")
    }
  }
}

@main def runComparison(): Unit = {

  val catType = Mammal.Cat
  val dogType = Mammal.Dog

  println(catType < dogType)
  println(dogType >= catType)
}
