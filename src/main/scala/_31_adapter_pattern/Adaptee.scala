package _31_adapter_pattern

class Adaptee { // does not implement SomeInterface (which is required)
  def adaptedOperation(): Unit = println("adaptedOperation")
}
