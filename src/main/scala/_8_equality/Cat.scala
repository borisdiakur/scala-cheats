package _8_equality

class Cat(private val name: String) {
  protected def canEqual(a: Any): Boolean = a.isInstanceOf[Cat]

  override def hashCode: Int = name.hashCode

  override def equals(that: Any): Boolean = {
    that match {
      case cat: Cat => cat.canEqual(this) && (cat.hashCode == this.hashCode)
      case _        => false
    }
  }
}

@main def runEquality(): Unit = {
  val myCat1 = new Cat("Mochi")
  val myCat2 = new Cat("Kimchi")
  val myCat3 = new Cat("Mochi")

  println(myCat1 == myCat2)
  println(myCat1 == myCat3)
}
