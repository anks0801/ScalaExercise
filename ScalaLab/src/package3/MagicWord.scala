package package3

object MagicWord {

  def main(args: Array[String]): Unit = {
    var magicWord = ""
    do {
      println("Guess the magic word ")
      magicWord = readLine.toString()
    } while (magicWord != "scala")

    println("Correct!!! Magic word is scala.")  
  }
}