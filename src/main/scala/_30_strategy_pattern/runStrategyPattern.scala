package _30_strategy_pattern

@main def runStrategyPattern(): Unit = {
  class Strategy1 extends Strategy {
    override def operation(): Unit = println("strategy 1")
  }

  class Strategy2 extends Strategy {
    override def operation(): Unit = println("strategy 2")
  }

  val c = Context(Strategy1())
  c.execute()

  c.strategy = Strategy2()
  c.execute()
}
