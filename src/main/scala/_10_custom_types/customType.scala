package _10_custom_types

@main def runCustomType(): Unit = {
  type Cat = Int

  val a: Cat = 2
  val b: Int = 2

  println(a + b)
  println(a.getClass)

  type CatList = List[Cat]

  val cats: CatList = List(a, b)

  println(cats)
}
