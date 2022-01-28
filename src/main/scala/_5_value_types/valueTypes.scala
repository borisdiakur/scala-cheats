package _5_value_types

/** Demonstrates the value ranges of the nine value types */
@main def valueTypes(): Unit = {
  println(s"Byte: [${Byte.MinValue}, ${Byte.MaxValue}]") // [-2^7, 2^7 - 1]
  println(s"Short: [${Short.MinValue}, ${Short.MaxValue}]") // [-2^15, 2^15 - 1]
  println(s"Int: [${Int.MinValue}, ${Int.MaxValue}]") // [-2^31, 2^31 - 1]
  println(s"Long: [${Long.MinValue}, ${Long.MaxValue}]") // [-2^63, 2^63 - 1]
  println(s"Float: [${Float.MinValue}, ${Float.MaxValue}]") // [-3.4028235E38, 3.4028235E38]
  println(s"Double: [${Double.MinValue}, ${Double.MaxValue}]") // [-1.7976931348623157E308, 1.7976931348623157E308]
  println(s"Char: [${Char.MinValue}, ${Char.MaxValue}]") // [’\u0000’, not printable]
  println(s"Boolean: {false, true}")
  println(s"Unit: {()}")

  // String is not a basic value type

  // Implicit type casting is allowed as follows:
  // Byte -> Short -> Int -> Long -> Float -> Double
  //                      ^
  //                    Char

  // Explicit type casting can go the other direction (with own risk).
}
