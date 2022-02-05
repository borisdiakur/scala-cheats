package _23_private_constructor

class CatPrivateConstructor private (val name: String) {
  var title: String = _

  def this(title: String, name: String) = {
    this(name)
    this.title = title
  }
}

@main def runCatPrivateConstructor(): Unit = {
  val cat = new CatPrivateConstructor("Mr.", "Miau")
  println(s"${cat.title} ${cat.name} created.")
}
