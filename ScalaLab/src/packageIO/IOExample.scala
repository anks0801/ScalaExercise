package packageIO
import java.io._

object IOExample {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("Demo.txt"))
    writer.write("Hello Scala")
    writer.close()
    print("File created!!!")
    //creates file in project root 
  }
}