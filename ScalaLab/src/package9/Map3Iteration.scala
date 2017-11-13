package package9

object Map3Iteration {
  def main(args: Array[String]): Unit = {
    
    val employee = Map(
      "Manager" -> "David",
      "TeamLead" -> "Carlos")
      
    for((k,v) <- employee)
      println(k + " : " + v )
      
    employee.keys.foreach{
      i => print("key:" + i )
           println(" value = " +employee(i))
    }
  }
}