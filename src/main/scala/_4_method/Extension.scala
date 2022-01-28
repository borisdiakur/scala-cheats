package _4_method

class Extension(var totalNumberOfThings: Int) {}

extension (i: Int) {
  def +(that: Extension): Int =
    i + that.totalNumberOfThings
}
