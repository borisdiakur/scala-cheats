package _2_class

import org.scalatest.funsuite.AnyFunSuite

import _2_class.*

class ClassSuite extends AnyFunSuite {
  test("4 should equal 4/1") {
    val cat = new Cat("Mochi")
    cat.sayMiau()
    cat.sayMiau()
    assert(cat.timesMiau == 2)
  }
}
