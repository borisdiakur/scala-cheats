package _15_apply

@main def runApply(): Unit = {

  class Yolo {
    def apply(message: String): Unit = {
      println(message)
    }
    def apply(num: Int): Unit = {
      println(num + 1)
    }
  }

  val yolo = Yolo()
  yolo("CHACKA!")
  yolo(1)
}
