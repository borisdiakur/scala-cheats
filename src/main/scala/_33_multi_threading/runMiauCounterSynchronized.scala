package _33_multi_threading

@main def runMiauCounterSynchronized(): Unit = {
  object NoisyCat {
    var totalMiaus = 0

    def increment(): Unit = {
      // ⚠️ synchronizes on this's monitor, which makes only sense if you wish to have one single monitor ⚠️
      this.synchronized {
        NoisyCat.totalMiaus += 1
      }
    }
  }

  class NoisyCat(miaus: Int) extends Thread {
    override def run(): Unit = increment()

    private def increment(): Unit = {
      Range(0, miaus).foreach((num: Int) => {
        NoisyCat.increment()
      })
    }
  }

  val cat1 = new NoisyCat(150)
  val cat2 = new NoisyCat(150)
  cat1.start()
  cat2.start()

  cat1.join()
  cat2.join()

  println(NoisyCat.totalMiaus)
}
