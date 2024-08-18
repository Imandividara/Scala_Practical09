object StringFormatter {
  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))         // Output: BENNY
    println(formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2))) // Output: NIroshan
    println(formatNames("Saman")(toLower))         // Output: saman
    println(formatNames("Kumara")(name => name.init + name.last.toUpper))  // Output: KumarA
  }
}
