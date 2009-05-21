// Scala allows to pimp your types with implicit conversions
// First create a class that has a =~ method implementing the comparision
class DoubleApproxEqual(d:Double) {
  private val ACCURACY = 0.01
  def =~(other:Double) = {
    Math.abs(d-other) < ACCURACY
  }
}
// Then create an implicit conversion
implicit def double2doubleApproxEqual(d:Double):DoubleApproxEqual = new DoubleApproxEqual(d)
// Now you can use the =~ method as operator for Doubles
assert(1.0 =~ 1.0)      // in accuracy
assert(1.0 =~ 1.001)    // in accuracy
assert(!(1.0 =~ 1.02))  // nope

