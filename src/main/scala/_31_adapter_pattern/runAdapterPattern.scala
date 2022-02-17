package _31_adapter_pattern

@main def runAdapterPattern(): Unit = {

  // someMethod expects an argument that implements SomeInterface.
  // SomeInterface expects the method operation to be implement,
  // but it is not implemented on Adaptee.
  // Thus, we cannot simply pass it Adaptee.
  def someMethod(arg: SomeInterface): Unit = {
    arg.operation()
  }

  // However, we can wrap Adaptee in an Adapter,
  // which implements SomeInterface and redirects the methods.
  val adapter: Adapter = Adapter(Adaptee())

  // Then, this adapter can be passed to the method.
  someMethod(adapter)
}
