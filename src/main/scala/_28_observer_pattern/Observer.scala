package _28_observer_pattern

trait Observer {
  def update(message: Option[String]): Unit
}
