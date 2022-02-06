package _33_multi_threading

import java.util.concurrent.locks.{ReentrantLock, ReentrantReadWriteLock}

@main def runMiauCounterLocked(): Unit = {
  object NoisyCat {
    var totalMiaus = 0
    // val totalMiausLock: ReentrantLock = ReentrantLock()
    val totalMiausLock: ReentrantReadWriteLock.WriteLock = ReentrantReadWriteLock().writeLock()

    def increment(): Unit = {
      totalMiausLock.lock()
      NoisyCat.totalMiaus += 1
      totalMiausLock.unlock()
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
