var patternString = readLine("Pattern: ")
while (patternString != null) {
  try {
    val pattern = patternString.trim.r
    println("VALID Pattern: " + pattern)
  } catch {
    case e: java.util.regex.PatternSyntaxException => println("INVALID Pattern: " + e.getMessage())
  }
  patternString = readLine("Pattern: ")
}

