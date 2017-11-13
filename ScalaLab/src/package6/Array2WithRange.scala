package package6
import Array._
object Array2WithRange {
  def main(args: Array[String]): Unit = {
    var array1 = range(10, 20, 2)
    
    for (i <-array1)
      println(i)
  }
}