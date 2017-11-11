package package5

object Functions {
  /*
   * def functionName (param1:datatype, param2:datatype) : ReturnType = {
   * 		function value
   * 		return value 
   * }
   * 
   * */
  
  def main(args: Array[String]): Unit = {
    def sum(x: Int, y:Int) : Int ={
      x+y
    }
    println("sum is :" + sum(2, 3))
  }
}