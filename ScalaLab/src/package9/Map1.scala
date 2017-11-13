package package9

object Map1 {
  def main(args: Array[String]): Unit = {
    val emp = Map(
      "Manager" -> "David",
      "TeamLead" -> "Carlos")

    if (emp.contains("Manager"))
      println("Manager: " +emp("Manager"))
      
    println("TeamLead: " +emp("TeamLead"))
  
  }

}