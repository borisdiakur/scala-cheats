package _24_secondary_constructor

class CatSecondaryConstructor(private val name: String) {
  def this() = {
    this("Noname")
  }

  def sayMiau(): Unit = {
    println(s"$name: Miau")
  }
}

@main def runCatSecondaryConstructor(): Unit = {
  val myCat = new CatSecondaryConstructor()
  myCat.sayMiau()
}
