package package7

object List5Tabulate {
  def main(args: Array[String]): Unit = {
    
    val double = List.tabulate(5)(n => n + n )

    print(double)
  }
}