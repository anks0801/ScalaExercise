package package3

object ForLoopNested {

  def main(args: Array[String]): Unit = {
    for (x <- 1 to 5; y <- 6 to 10) {
      println("x :" + x)
      println("y :" + y)
    }
  }

}