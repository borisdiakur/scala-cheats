package _2_class

@main def main(): Unit = {
  val myCat1 = new Cat("Mochi")
  val myCat2 = new Cat("Kimchi")
  val myCat3 = new CatSecondaryConstructor()

  myCat1.sayMiau()
  myCat2.sayMiau()
  myCat1.sayMiau()
  myCat2.sayMiau()
  myCat3.sayMiau()

  println(
    s"Total miaus: ${myCat1.timesMiau + myCat2.timesMiau + myCat3.timesMiau}"
  )
}
