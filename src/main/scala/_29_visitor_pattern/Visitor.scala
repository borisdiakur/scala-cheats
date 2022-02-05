package _29_visitor_pattern

trait Visitor[A] {
  def visit(a: A): Unit
}
