package _19_trait

trait A {
  def yolo(): Unit = {
    print("A")
  }
}

trait B extends A {
  override def yolo(): Unit = {
    print("B")
    super.yolo()
  }
}

trait C extends A {
  override def yolo(): Unit = {
    print("C")
    super.yolo()
  }
}

class D extends B, C

class E extends B with C

class F extends C with B

class G extends C, B

@main def runDiamondProblem(): Unit = {
  val d = D()
  d.yolo() // -> prints "CBA", going from right to left, ending with base
  println()

  val e = E()
  e.yolo() // -> prints "CBA", going from right to left, ending with base
  println()

  val f = F()
  f.yolo() // -> prints "BCA", going from right to left, ending with base
  println()

  val g = G()
  g.yolo() // -> prints "BCA", going from right to left, ending with base
  println()
}
