package _4_method

class Overloading {
  def saySomething(): Unit = {
    println("something")
  }

  def saySomething(toSay: String): Unit = {
    println(toSay)
  }
}

@main def runOverloading(): Unit = {
  val o: Overloading = new Overloading()
  o.saySomething()
  o.saySomething("something else")
}
