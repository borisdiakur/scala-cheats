package _28_observer_pattern

import scala.collection.mutable

trait Observable {

  val observers: mutable.Set[Observer] = mutable.Set()

  /** Registers an observer to be notified. */
  def subscribe(obs: Observer): Boolean = observers.add(obs)

  /** Deregisters an observer to be notied. */
  def unsubscribe(obs: Observer): Boolean = observers.remove(obs)

  /** Notify all registered observers in case of an update. */
  def notifyObservers(): Unit = {
    observers.foreach((obs: Observer) => obs.update())
  }
}
