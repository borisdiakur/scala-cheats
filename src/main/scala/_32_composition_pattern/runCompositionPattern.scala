package _32_composition_pattern

// Interface that every component must implement
trait IsComponent {

  // The functionality shared by all components
  def print(): Unit
}

// Represents the composition. This composition can have an arbitary number of children, which are also components.
class Composit(children: IsComponent*) extends IsComponent {

  // Performs functionality for itself and calls the functionality for all children
  override def print(): Unit = {
    println("Composit")
    children.foreach((component: IsComponent) => component.print())
  }
}

// Represents a leaf. Cannot have children.
class Leaf(val value: Int) extends IsComponent {
  override def print(): Unit = println("Leaf " + value)
}

@main def runCompositionPattern(): Unit = {
  // Composition can be used to form complex hierarchies
  val root = Composit(Leaf(1), Composit(Composit(Leaf(2), Leaf(3)), Leaf(4)))
  root.print()
}
