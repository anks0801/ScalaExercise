package package3

object DoWhile {

  def main(args: Array[String]): Unit = {

    var i = 0

    do {
      println(i)
      i += 1
    } while (i <= 10)
  }
}