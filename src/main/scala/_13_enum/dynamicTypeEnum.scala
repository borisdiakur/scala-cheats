package _13_enum

@main def runDynamicTypeEnum(): Unit = {
  enum MamalType {
    case Cat, Dog
  }

  enum Variant(val mamalType: MamalType) {
    case CatType(val name: String) extends Variant(MamalType.Cat)
    case DogType(val name: String) extends Variant(MamalType.Dog)
  }

  val v1: Variant = Variant.CatType("Mochi")
  val v2: Variant.CatType = Variant.CatType("Kimchi")
  val v3: Variant.DogType = Variant.DogType("Naonao")

  println(s"${v2.name} is a ${v2.mamalType}.")
  println(s"${v3.name} is a ${v3.mamalType}.")
  println(s"${v1.mamalType}s are sweet.")
}
