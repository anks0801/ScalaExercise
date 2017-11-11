package package3

import scala.util.control.Breaks

object ForLoopWithBreak {
  def main(args: Array[String]): Unit = {
    var i = 0
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val loop = new Breaks;
    loop.breakable {
      for (i <- 1 to 10) {
        println(i);
        if (i == 5) {
          loop.break;
        }
      }
    }
    println("loop finished.")
  }
}