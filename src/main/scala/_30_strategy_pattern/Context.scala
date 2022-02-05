package _30_strategy_pattern

class Context(var strategy: Strategy) {
  def execute(): Unit = strategy.operation()
}
