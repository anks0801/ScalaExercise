package packageIO
import scala.io.Source

object ReadFile {
  def main(args: Array[String]): Unit = {
    Source.fromFile("Demo.txt").foreach {
      print
    }
  }
}