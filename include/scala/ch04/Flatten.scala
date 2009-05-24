val list = List(1, 2, List(3, 4),5,List(6,7))
val flattened = list flatMap { 
  case iterable: Iterable[_] => iterable
  case other                 => List(other)
}
println(flattened)  // Will result in List(1, 2, 3, 4, 5, 6, 7)
