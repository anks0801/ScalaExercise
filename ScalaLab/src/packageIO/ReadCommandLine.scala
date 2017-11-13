package packageIO

object ReadCommandLine {
  def main(args: Array[String]): Unit = {
    print("Please enter your input : " )
    val line = Console.readLine
    println("you entered " +line)
  }
}