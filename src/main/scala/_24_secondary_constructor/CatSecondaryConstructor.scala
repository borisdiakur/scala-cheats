package _24_secondary_constructor

class CatSecondaryConstructor(private val name: String) {
  var timesMiau: Int = 0 // public

  def this() = {
    this("Noname")
  }

  def sayMiau(): Unit = {
    println(s"$name: Miau")
    timesMiau += 1
  }
}

@main def runCatSecondaryConstructor(): Unit = {
  val myCat = new CatSecondaryConstructor()
  myCat.sayMiau()
}
