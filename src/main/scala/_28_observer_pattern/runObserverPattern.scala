package _28_observer_pattern

@main def runObserverPattern(): Unit = {

  class Cat(val name: String) extends Observer, Observable {
    def sayHi(): Unit = {
      println(s"Miau. I'm $name.")
      notifyObservers()
    }

    override def update(): Unit = {
      println(s"Miau. I'm $name.")
    }
  }

  val cat1 = Cat("Mochi")
  val cat2 = Cat("Kimchi")
  cat1.subscribe(cat2)
  cat2.subscribe(cat1)
  cat1.sayHi()
}
