package package5

object Function1 {
  def main(args: Array[String]): Unit = {
    def sum(x: Int = 10, y:Int =20) : Int ={
      x+y
    }
    println("sum is :" + sum())
  }
}