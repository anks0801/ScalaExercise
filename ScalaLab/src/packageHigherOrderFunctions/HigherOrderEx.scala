package packageHigherOrderFunctions

object HigherOrderEx {
  def main(args: Array[String]): Unit = {
  
  val list = List(1,2,3,4,5)
  
  list.map((i:Int) => i*2).foreach(println) 
  
  list.filter(_ < 3).foreach(println)
  
  }
}