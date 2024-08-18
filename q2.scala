object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      try {
        val input = args(0).toInt

        val matchInput: Int => String = {
          case x if x <= 0 => "Negative/Zero is input"
          case x if x % 2 == 0 => "Even number is given"
          case _ => "Odd number is given"
        }

        println(matchInput(input))

      } catch {
        case e: NumberFormatException =>
          println("Please enter a valid integer.")
      }
    } else {
      println("Please provide an integer input from the command line.")
    }
  }
}
