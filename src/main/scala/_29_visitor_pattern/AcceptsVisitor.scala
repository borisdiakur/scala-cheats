package _29_visitor_pattern

trait AcceptsVisitor[A] {
  def accept(visitor: Visitor[A]): Unit
}
