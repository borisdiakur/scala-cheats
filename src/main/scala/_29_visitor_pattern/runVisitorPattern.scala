package _29_visitor_pattern

class Cat(val name: String) extends AcceptsVisitor[Cat] {
  def accept(visitor: Visitor[Cat]): Unit = {
    visitor.visit(this)
  }
}

class NamePrinter extends Visitor[Cat] {
  override def visit(a: Cat): Unit = println(a.name)
}
class NameReversePrinter extends Visitor[Cat] {
  override def visit(a: Cat): Unit = println(a.name.reverse)
}

@main def runVisitorPattern(): Unit = {
  val cat1 = Cat("Mochi")
  val cat2 = Cat("Kimchi")

  val namePrinter = NamePrinter()
  cat1.accept(namePrinter)
  cat2.accept(namePrinter)

  val nameReversePrinter = NameReversePrinter()
  cat1.accept(nameReversePrinter)
  cat2.accept(nameReversePrinter)
}
