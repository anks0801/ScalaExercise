package package6

object Array1 {
  def main(args: Array[String]): Unit = {
    var a = new Array[Int](5)
    for (i <- 0 until a.length)
      a(i) = i
      
    for (i <- a)
      print(i)
  }
}
