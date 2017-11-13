package packageExceptionHandling

import java.io.FileReader
import java.io.IOException
import java.io.FileNotFoundException

object ExceptionEx {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("test.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }finally {
      println("finished Exception Handling")
    }
  }
}