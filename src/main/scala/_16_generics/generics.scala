package _16_generics

@main def runGenerics(): Unit = {
  // usage
  val seq1 = Seq(1, "2", '3') // Accepts anything by default.
  val seq2: Seq[Int] = Seq(1, 2, 3) // Int enforced.

  // creation of a generic class
  class CatGeneric[A](something: A) {
    override def toString: String = s"Miau. $something"
  }

  val myCat1 = CatGeneric[String]("My name is Mochi.")
  val myCat2 = CatGeneric[Int](123)
  println(myCat1)
  println(myCat2)
}
