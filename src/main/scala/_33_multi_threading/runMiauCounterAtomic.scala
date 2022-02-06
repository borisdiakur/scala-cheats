package _33_multi_threading

import java.util.concurrent.atomic.AtomicInteger

@main def runMiauCounterAtomic(): Unit = {
  object NoisyCat {
    val totalMiaus: AtomicInteger = AtomicInteger(0)

    def increment(): Unit = {
      NoisyCat.totalMiaus.getAndAdd(1)
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
