package _25_abstract_class

abstract class Mammal(val livesOnEarth: Boolean) {
  protected def totalLegs: Int

  override def toString: String = "Mammal"
}

abstract class DogAbstract extends Mammal(true) {
  def bark(): Unit

  def totalLegs = 4

  def pee(): Unit = {
    println("psssss...")
  }

  override def toString: String = "Dog"
}

class Dog(val name: String) extends DogAbstract {
  def bark(): Unit = {
    println("Wuff!")
  }
}

@main def runDogAbstract(): Unit = {
  val myDog = Dog("Naonao")
  myDog.bark()
  myDog.pee()
  println(
    s"My dog ${myDog.name} has ${myDog.totalLegs} legs and has peed ${if (myDog.livesOnEarth) "on earth" else "in space"}."
  )
}
