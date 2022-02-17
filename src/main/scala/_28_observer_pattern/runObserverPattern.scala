package _28_observer_pattern

@main def runObserverPattern(): Unit = {

  class Cat(val name: String) extends Observer, Observable {
    def sayHi(): Unit = {
      println(s"Miau. I'm $name.")
      notifyObservers(None)
      notifyObservers(Some("Miaaauuu!"))
    }

    override def update(message: Option[String]): Unit = {
      message match {
        case Some(m: String) => println(s"My name spelled backwards is ${name.reverse}. $m")
        case None            => println(s"Miau. I'm $name.")
      }
    }
  }

  val cat1 = Cat("Mochi")
  val cat2 = Cat("Kimchi")
  cat1.subscribe(cat2)
  cat2.subscribe(cat1)
  cat1.sayHi()
}
