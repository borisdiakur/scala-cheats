package _17_iterable

class CatMomIterator(catMom: CatMom) extends Iterator[Kitten] {
  private var currentKittenID = 0

  override def hasNext: Boolean = currentKittenID < catMom.totalKittens

  override def next(): Kitten = {
    val kittenOption = catMom.getKitten(currentKittenID)
    currentKittenID += 1
    val kitten = kittenOption match {
      case Some(kitten: Kitten) => kitten
      case None                 => null
    }
    kitten
  }
}

class Kitten(val name: String) {}

class CatMom(private val kittens: Map[Int, Kitten]) extends Iterable[Kitten] {
  val totalKittens: Int = kittens.size

  def getKitten(id: Int): Option[Kitten] = kittens.get(id)

  def iterator: Iterator[Kitten] = CatMomIterator(this)
}

@main def runKittens(): Unit = {
  val myCatMom = CatMom(Map(0 -> Kitten("Mochi"), 1 -> Kitten("Kimchi")))
  myCatMom.foreach(kitten => {
    println(kitten.name)
  })
}
