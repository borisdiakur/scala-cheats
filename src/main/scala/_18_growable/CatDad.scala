package _18_growable

import scala.collection.mutable

class Kitten(val name: String) {}

class CatDad(private var kittens: mutable.Map[Int, Kitten]) extends mutable.Growable[Kitten] {
  def getKitten(id: Int): Option[Kitten] = kittens.get(id)

  override def addOne(kitten: Kitten): this.type = {
    kittens = kittens ++ Map(kittens.size -> kitten)
    this
  }

  override def clear(): Unit = {
    kittens.clear()
  }

  // override def knownSize: Int = super.knownSize

  override def toString: String = {
    kittens
      .map((id, kitten) => kitten.name)
      .reduceOption((a, b) => a + " and " + b)
      .getOrElse("No kittens :´(")
  }
}

@main def runKittens(): Unit = {
  val myCatDad = CatDad(mutable.Map(0 -> Kitten("Mochi")))
  println(myCatDad.addOne(Kitten("Kimchi")))
  myCatDad.clear()
  println(myCatDad)
  myCatDad ++= Seq(Kitten("Mochi"), Kitten("Kimchi"))
  println(myCatDad)
  println(": )")
}
