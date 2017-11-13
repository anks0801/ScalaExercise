package package9

object MapMutable {
  def main(args: Array[String]): Unit = {
    
    val student = collection.mutable.Map(1 -> "Mark",
                      2 -> "Jeremy")
                      
    println(student(1))
    
    student(1) = "Megan"
    
    println(student(1))
    
  }
}