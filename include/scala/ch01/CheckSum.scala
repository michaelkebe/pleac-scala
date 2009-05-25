import java.io.FileInputStream
val input = new FileInputStream(args(0))
var checksum = 0
var c = 0
while ({c = input.read(); c != -1}) {
  checksum += c
}
checksum %= (Math.pow(2, 16) - 1).toInt
println(checksum)

