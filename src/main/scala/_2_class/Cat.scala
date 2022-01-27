package _2_class

class Cat(private val name: String) {
  var timesMiau: Int = 0 // public

  def sayMiau(): Unit = {
    println(s"$name: Miau")
    timesMiau += 1
  }
}
