package _2_class

@main def main(): Unit = {
  val myCat1 = new Cat("Mochi")
  val myCat2 = new Cat("Kimchi")

  myCat1.sayMiau()
  myCat2.sayMiau()
  myCat1.sayMiau()
  myCat2.sayMiau()

  println(s"Total miaus: ${myCat1.timesMiau + myCat2.timesMiau}")
}
