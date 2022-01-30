package _2_class

class Cat(private val name: String) {
  var timesMiau: Int = 0 // public

  def sayMiau(): Unit = {
    println(s"$name: Miau")
    timesMiau += 1
  }
}

@main def runCat(): Unit = {
  val myCat1 = new Cat("Mochi")
  val myCat2 = new Cat("Kimchi")

  myCat1.sayMiau()
  myCat2.sayMiau()
  myCat1.sayMiau()
  myCat2.sayMiau()

  println(s"Total miaus: ${myCat1.timesMiau + myCat2.timesMiau}")
}
