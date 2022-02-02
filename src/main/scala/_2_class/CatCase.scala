package _2_class

case class CatCase(name: String) {
  var miaus = 0
}

@main def runCatCase(): Unit = {
  val myCat1 = CatCase("Mochi")
  val myCat2 = CatCase("Kimchi")
  val myCat3 = CatCase("Mochi")
  myCat3.miaus = 1 // -> myCat1 and myCat3 are still equal

  println(myCat1 == myCat2)
  println(myCat1 == myCat3)
  println(myCat1.name)
  println(myCat1)
  println(myCat3 match {
    case CatCase(name) => s"I'm $name. Miau!"
  })
  println(myCat3.miaus)
}
