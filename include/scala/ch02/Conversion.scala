print("Gimme a number in decimal, octal, or hex: ")
val input = readLine.trim
val number = if (input.matches("""^0x[\da-fA-F]+$""")) {
  Integer.parseInt(input.substring(2), 16)
} else if (input.matches("""^0\d+$""")) {
  Integer.parseInt(input.substring(1), 8)
} else if (input.matches("""\d+""")) {
  Integer.parseInt(input)
} else {
  println("Not a number: " + input)
  exit(-1)
}
println("Decimal value: " + number)

