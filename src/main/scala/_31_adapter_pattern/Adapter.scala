package _31_adapter_pattern

class Adapter(adaptee: Adaptee) extends SomeInterface {
  def operation(): Unit = {
    adaptee.adaptedOperation()
  }
}
