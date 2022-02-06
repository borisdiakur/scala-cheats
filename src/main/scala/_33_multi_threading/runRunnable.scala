package _33_multi_threading

@main def runRunnable(): Unit = {
  def printNumsAndThreadIds = (total: Int) => {
    Range(0, total).foreach((number: Int) => println(s"Number: $number (thread ID: ${Thread.currentThread.getId})"))
  }

  class CatRunnable extends Runnable {
    override def run(): Unit = {
      printNumsAndThreadIds(3)
    }
  }

  println(s"Main thread ID: ${Thread.currentThread.getId}")

  val cat = new CatRunnable()
  // cat.run() // -> runs in main thread
  val thread = new Thread(cat)
  thread.start()

  printNumsAndThreadIds(5)

  thread.join() // Awaits thread to finish its work before continuing in main thread.
  println("All done.")
}
