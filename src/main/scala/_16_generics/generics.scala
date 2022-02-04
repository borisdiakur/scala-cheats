package _16_generics

@main def runGenerics(): Unit = {
  // usage
  val seq1 = Seq(1, "2", '3') // Accepts anything by default.
  val seq2: Seq[Int] = Seq(1, 2, 3) // Int enforced.

  // creation of a generic class
  class CatGeneric[A](something: A) {
    override def toString: String = {
      something match {
        case i: String => s"Miau. $something"
        case d: Int    => s"Miau! $something times miau!"
        case None      => "WAT?"
        case _         => "???"
      }
    }
  }

  val myCat1 = CatGeneric[String]("My name is Mochi.")
  val myCat2 = CatGeneric[Int](123)
  val myCat3 = CatGeneric[Null](null)
  val myCat4 = CatGeneric[None.type](None)
  println(myCat1)
  println(myCat2)
  println(myCat3)
  println(myCat4)
}
