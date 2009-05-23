// Solution by Phil Gold : http://aperiodic.net/phil/scala/s-99/
object Flatten {

	def flatten(l: List[Any]): List[Any] = l flatMap {
    		case l: List[_] => flatten(l)
    		case e => List(e)
  	}
}

val list = List(1,2,List(5, 7, 6), 3, 4)
println("Before: " + list )
println(" After: " + Flatten.flatten(list))
