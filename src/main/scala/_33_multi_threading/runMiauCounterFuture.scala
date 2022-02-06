package _33_multi_threading

import scala.concurrent.{Await, Future}
import concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

@main def runMiauCounterFuture(): Unit = {
  class PromisingCat(name: String) {
    private def miau(): String = {
      Thread.sleep((new scala.util.Random).nextInt(1000))
      s"Miau. My name is $name"
    }

    def miauFuture: Future[String] = Future(miau())
  }

  val futures: List[Future[String]] = List(PromisingCat("Mochi").miauFuture, PromisingCat("Kimchi").miauFuture)
  val miaus: List[String] = futures.map(future => Await.result(future, Duration.Inf)) // Await blocks main thread only

  miaus.foreach(miau => {
    println(miau)
  })
}
