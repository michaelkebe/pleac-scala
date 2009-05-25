import scala.io.Source
val file = Source.fromFile(args(0))
val delay = args(1).toLong
for (c <- file) {
  Thread.sleep(delay)
  print(c)
}

