package package5

object Function2 {

  def main(args: Array[String]): Unit = {
    def addAll(args: Int*): Int = {
      var add = 0
      for (num <- args) {
        add += num
      }
      add
    }
    println("Addition of all = " + addAll(1, 2, 3))
  }
}