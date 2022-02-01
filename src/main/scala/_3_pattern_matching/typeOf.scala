package _3_pattern_matching

class A

class B extends A

@main def runTypeOf(): Unit = {
  def typeOf(arg: Any): String = arg match {
    case i: Int    => i.toString + " is an Int."
    case d: Double => d.toString + " is a Double."
    case b: B      => "arg is B." // Order is important!
    case a: A      => "arg is A." // Extending must precede extended!
    case _         => arg.toString + " has some other type."
  }

  println(typeOf(4))
  println(typeOf("Yolo"))
  println(typeOf(new A))
  println(typeOf(new B))
}
