package _31_adapter_pattern

@main def runAdapterPattern(): Unit = {

  // someMethod expects an argument that implements SomeInterface.
  // Thus, we cannot simply pass it Adaptee
  def someMethod(arg: SomeInterface): Unit = {
    arg.operation()
  }

  // Instead, we first wrap Adaptee in an Adapter,
  // which implements UsedInterface and redirects the methods
  val adapter: Adapter = Adapter(Adaptee())

  // Then, this adapter can be passed to the method.
  someMethod(adapter)
}
