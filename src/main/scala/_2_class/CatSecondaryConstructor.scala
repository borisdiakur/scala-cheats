package _2_class

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
